# Video-Recorder

The goal of the project is to produce code for the VideoRecorder component in a simplified video recorder product 
-	Demonstrate an ability to interpret requirements and convert them to an implementation
-	Demonstrate OO design skills by defining the right class structures.  
-	Demonstrate TDD and test skills by writing some unit tests as part of the coding work
Application: Typically a GUI, the application has been emulated for this exercise by a console application, which allows the user to enter a number of commands and receive textual feedback.
Recorder: Component that receives the actual AV streams via the IP network or satellite tuners, stores recorded AV content on a HDD and plays back recorded AV content to a TV. This component is controlled by the VideoRecorder component.
Program Guide: Component that provides the VideoRecorder with information about the name and duration of television programs. AV streams for a specific television channel are made up of a sequence of concatenated television programs.  
Video Recorder: This is the component that must be developed for this exercise and is intended to contain the “business logic” that satisfies the requirements below.
User commands
On the IVideoRecorder API, the user is able to exercise the following functionality (using the console app):
Record:  Schedule record of all programs for which at least a part is received in the time range that is input by the user in the record command. E.g. if the user calls record with startTime 2013/3/3 15:00:00 and stopTime 2013/3/3 16:00:00 and there is a program A available from 14:30 till 15:30 and program B from 15:30 till 16:30, then the video recorder should aim to record from 14:30 to 16:30 in order to record both programs in their entirety. A recording is a sequence of programs that is represented with one recording id. The provided recording id should be kept by the video recorder such that it can be used to cancel or play the recording.
Play: Play the recording with the provided recording id.
For simulation purposes, the Recorder component has a clock that can be set to emulate a change in time. This is done using the SetTime command. The GetTime command retrieves the current time. The user can use the SetTime command to jump to another time and check whether the VideoRecorder behaves as expected.
Resource conflicts
The Recorder component has resources to record only 2 video streams at the same time. It is up to the Video Recorder component to prevent cases where the recorder runs out of resources. If the user tries to schedule a recording that causes a resource conflict, the recording should fail and an error returned to the user.
Another resource constraint is that the maximum number of streams that can be played back at any time is one, since the recorder is only hooked up to one TV.
Desired user behaviour
-	The user can execute the commands listed in the User Commands section
-	The recorder performs recordings and plays back content  - printing out something on the console is used to simulate this behaviour
-	The user is notified of conflicts
One thing that may help in analysing the behaviour is to add a command to get the list of completed and scheduled recordings in order to get a feel for what the Recorder state is at any point in time.


