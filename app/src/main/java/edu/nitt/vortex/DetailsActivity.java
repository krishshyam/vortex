package edu.nitt.vortex;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends Activity {

    public String[] contentStrings={"It is a ACM-ICPC type programming contest. It is held online on Hackerrank's platform. The participants are expected to score maximum amount of points from the question. The winner is decided on the basis of the leader-board.\n" +
            "\n" +
            "PRIZE: \n" +
            "\n" +
            "FIRST: 4000\n" +
            "\n" +
            "SECOND: 2500",
            "The onsite Programming Contest is the offline Algorithm contest between the participants. They are not only tested their Algorithm adrenaline , also the grip over various other general knowledge on computer science.\n" +
                    "TEAM :A team consists a maximum of three participants, not necessarily from same college or department.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "ROUND 1\n" +
                    "\n" +
                    "It tests the grip over various domains of computer science. It is a paper-pen based test, and acts as an eliminating round. Out of all the teams, only top 8 teams move forward to the next round.Time limit-60 minutes\n" +
                    "\n" +
                    "ROUND 2\n" +
                    "\n" +
                    "It consist of questions, asking to write codes to solve them. The entire team will be allocated one computer and they will have to solve the maximum number of questions. The questions will be evaluated on the various test cases. Time Limit: 90 minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 5000\n" +
                    "\n" +
                    "SECOND: 3000\n" +
                    "\n" +
                    "THIRD: 2000",
            "The ability to learn new things is one of the most human things to do and over the last decade, tremendous amount of work has been done to develop that capability in machines. This, combined with the ability to store and analyze vast amounts of data that's continually increasing with veracity, gives us a powerful tool to solve some real world problems.\n" +
                    "\n" +
                    "This contest is for those hackers, who are sitting at the intersection of statistics, data, and algorithms.\n" +
                    "\n" +
                    "In this track, you will be given the following:\n" +
                    "\n" +
                    "A problem statement\n" +
                    "A training dataset\n" +
                    "A test dataset\n" +
                    "FORMAT\n" +
                    "\n" +
                    "It is an online event.\n" +
                    "Based on the problem statement, you will have to build models to predict the correct output. You will then have to submit your output for the test data.\n" +
                    "\n" +
                    "Note: Visit our Facebook page for further updates.\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 3000\n" +
                    "\n" +
                    "SECOND: 2000",
            "It is a platform for students to showcase their innovations in the various fields of technology. It is of two rounds. The first one is online registration and abstract submission round, while the second is presentations of selected papers.\n" +
                    "TEAM :It is an individual event.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "ROUND 1\n" +
                    "\n" +
                    "The participants have to submit the abstract of the paper by FEB 1, 5:00PM to cseanitt@gmail.com with subject PAPER ABSTRACT\n" +
                    "\n" +
                    "ROUND 2\n" +
                    "\n" +
                    "The selected participants will be intimated , they will have to present the final paper before the panel of esteemed judges. Time Limit: 12 (10+2) minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 3000\n" +
                    "\n" +
                    "SECOND: 2000\n" +
                    "\n" +
                    "THIRD: 1000",
            "It is a three stage event. It tests the aptitude, c and c++ skills(language skills) and the various concepts of computer science( OS, DBMS, Computer architecture etc). It is a written-event, where in the participants have to answer questions on the various domains.\n" +
                    "Team: A team consists a maximum of three participants, not necessarily from same college or department.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "PRELIMS\n" +
                    "\n" +
                    "It tests the grip over the given domains . It is a paper-pen based test, and acts as an eliminating round. Out of all the teams, only top 8 teams move forward to the next round. All the team have to answer questions from all the three domains, cumulative scores will be calculation for elimination.\n" +
                    "TIME :90 minutes (30 + 30 + 30)\n" +
                    "\n" +
                    "FINALS\n" +
                    "\n" +
                    "It will be the clash of the top 8 teams of the previous rounds. They will be tested on their expertise on being a computer scientist. Questions from all domains of computer science will be asked\n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 4000\n" +
                    "\n" +
                    "SECOND: 2500\n" +
                    "\n" +
                    "THIRD: 1500",
            "It is the online treasure hunt event. It requires expertise in Encoding and decoding of ciphers, General knowledge, googling excellency and loads of common sense. It is an individual event. The winner is decided according to the leader board. The participant solving most number of levels in least time is judged victorious..\n" +
                    "\n" +
                    "Link to event: http://clueless.vortex.nitt.edu\n" +
                    "\n" +
                    "START DATE 20 JANUARY,2016 6PM\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 2500\n" +
                    "\n" +
                    "SECOND: 1500\n" +
                    "\n" +
                    "THIRD: 1000",
            "It is the perfect blend of reverse coding and debugging. Reverse coding tests the ability of the students to trace back to the logic of the code from the given set of input and output. Debugging tests their ability to find the errors in the codes, training them to write flawless codes. \n" +
                    "Team: A team consists a maximum of three participants, not necessarily from same college or department.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "PRELIMS\n" +
                    "\n" +
                    "It tests the required skills of debugging and reverse coding . It is a paper-pen based test, and acts as an eliminating round. Out of all the teams, only top 8 teams move forward to the next round. \n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "FINALS\n" +
                    "\n" +
                    "It consist of erroneous codes,asking the participants to debug so as to obtain working codes with unaltered logic. It also consists of executable files, which gives outputs on giving input. Participants are expected to write codes for them. \n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 3000\n" +
                    "\n" +
                    "SECOND: 2000\n" +
                    "\n" +
                    "THIRD: 1000",
            "The participants are expected to build fully functional websites from scratch,on a given theme, in a given duration of time. \n" +
                    "Team: A team consists a maximum of three participants, not necessarily from same college or department.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "PRELIMS\n" +
                    "\n" +
                    "It tests the basic website development skills of the participants. It is a paper-pen based test, and acts as an eliminating round. Out of all the teams, only top 8 teams move forward to the next round. \n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "FINALS\n" +
                    "\n" +
                    "In this round, a theme will be given to the participants. They are expected to build a fully functional website in the stipulated time. They are judged on the basis of functionalities they have provided,code security, design parameters. \n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 3000\n" +
                    "\n" +
                    "SECOND: 2000\n" +
                    "\n" +
                    "THIRD: 1000",
            "It tests the technical quotient of the participants by testing them through various rounds of quizzing. Questions from various technical developments and general knowledge on computer science will be asked. \n" +
                    "Team: A team consists a maximum of three participants, not necessarily from same college or department.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "PRELIMS\n" +
                    "\n" +
                    "It tests the grip over various technical know-hows. It is a paper-pen based test, and acts as an eliminating round. Out of all the teams, only top 8 teams move forward to the next round. \n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "FINALS\n" +
                    "\n" +
                    "It consist of several rounds of quizzing. The finalists will be tested on their knowledge of technology. The team with the highest points is judged as the winner. \n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 4000\n" +
                    "\n" +
                    "SECOND: 2500\n" +
                    "\n" +
                    "THIRD: 1500",
            "This event tests the synchronization of the team members. In this event, the Teamsa re given technical term as keywords of DUMB-C. One of the member will be given the word to explain, which he have to make the other members guess, without opening his mouth. \n" +
                    "Team: A team consists a maximum of three participants, not necessarily from same college or department.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "PRELIMS\n" +
                    "\n" +
                    "It tests the synchronizaion between the mates of the team. The teams will be asked to make guesses of terms acted by one of the mates. The teams guessing maximum number of terms in a time span of 1 minute will move forward to the next roud.acts as an eliminating round. Out of all the teams, only top 8 teams move forward to the next round. \n" +
                    "TIME :1 minute / team.\n" +
                    "\n" +
                    "FINALS\n" +
                    "\n" +
                    "It consist of several rounds of quizzing. The finalists will be tested on their knowledge of technology. The team with the highest points is judged as the winner. \n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "FIRST:1500\n" +
                    "SECOND:1000\n" +
                    "THIRD:500",
            "It is the event to test the mathematic skill of the participants. It is an offline contest. Team: A team consists a maximum of two participants, not necessarily from same college or department.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "PRELIMS\n" +
                    "\n" +
                    "It tests the grip over various aspects of mathematics. It is a paper-pen based test, and acts as an eliminating round. Out of all the teams, only top 8 teams move forward to the next round.\n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "FINALS\n" +
                    "\n" +
                    "It consist of questions, asking to be solved accurately with vigorous speed.\n" +
                    "TIME :60 minutes\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 2500\n" +
                    "\n" +
                    "SECOND: 1500\n" +
                    "\n" +
                    "THIRD: 1000",
            "It is an ethical hacking contest in which certain pieces of information called \"flags\" are hidden on servers or files stored somewhere difficult to access. Bring a team ready to be tested on cryptography, steganography, application security, binary analysis, reverse engineering, and other real-world problems on their way to capture the flag.\n" +
                    "\n" +
                    "FORMAT\n" +
                    "\n" +
                    "A team of three, Jeopardy-style, one-day contest.\n" +
                    "Platform: HackerRank\n" +
                    "\n" +
                    "Note: Visit our Facebook page for further updates.\n" +
                    "\n" +
                    "PRIZE: \n" +
                    "\n" +
                    "FIRST: 4000\n" +
                    "\n" +
                    "SECOND: 2500"


    };

    public String[] w_contentStrings={
            "Python is an easy to learn, powerful programming language. It has efficient high-level data structures and a simple but effective approach to object-oriented programming. Python’s elegant syntax and dynamic typing, together with its interpreted nature, make it an ideal language for scripting and rapid application development in many areas on most platforms.\n" +
                    "\n" +
                    "COURSE CONTENT\n" +
                    "\n" +
                    "Environment Setup\n" +
                    "Syntax of Python\n" +
                    "Conditionals\n" +
                    "Operators\n" +
                    "Loops\n" +
                    "Variables\n" +
                    "Python Dictionaries and Lists\n" +
                    "Functions\n" +
                    "\n" +
                    "DETAILS\n" +
                    "\n" +
                    "Fees:Rs. 300/Participant\n" +
                    "Duration:2 Days (3pm-6pm)\n" +
                    "Organizer:Spider\n" +
                    "Dates:4 Feb - 5 Feb\n" +
                    "Please note that registrations will be confirmed only after payment on first come first serve basis. \n" +
                    "\n" +
                    "Please bring a laptop when you come for the workshop.",
            "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design. Built by experienced developers, it takes care of much of the hassle of Web development, so you can focus on writing your app without needing to reinvent the wheel. It’s free and open source. Its Ridiculously fast. Reassuringly secure. Exceedingly scalable.\n" +
                    "\n" +
                    "COURSE CONTENT\n" +
                    "\n" +
                    "Installation\n" +
                    "Request response Cycle\n" +
                    "Structure of a Django Project\n" +
                    "Django admin, settings and import\n" +
                    "Models, Queryset,Dbshell and sqlite3\n" +
                    "URL’s, Routing and regular expressions\n" +
                    "Function based views\n" +
                    "Template rendering\n" +
                    "Django Test Client\n" +
                    "Mini Project\n" +
                    "\n" +
                    "DETAILS\n" +
                    "\n" +
                    "Fees:Rs. 300/Participant\n" +
                    "Duration:2 Days (3pm-6pm)\n" +
                    "Organizer:Spider\n" +
                    "Dates:4 Feb - 5 Feb\n" +
                    "Please note that registrations will be confirmed only after payment on first come first serve basis. \n" +
                    "\n" +
                    "Please bring a laptop when you come for the workshop.",
            "Information security and privacy is at the forefront of concerns in an age dominated by the inter-web. Learn to look for weakness and vulnerabilities in target systems and use them in lawful manner to suggest security measures. You are the superhero at our workshop!\n" +
                    "\n" +
                    "COURSE CONTENT\n" +
                    "\n" +
                    "Introduction to Ethical Hacking\n" +
                    "Email Hacking and Tracing\n" +
                    "Spoofing Series\n" +
                    "Computer Hacking and Forensics\n" +
                    "Trojans and Viruses\n" +
                    "Sniffers\n" +
                    "Google Dorking\n" +
                    "Social Engineering\n" +
                    "Cryptography\n" +
                    "Advanced Website Attacks\n" +
                    "Penetration Testing with Kali Linux\n" +
                    "Wireless Hacking\n" +
                    "\n" +
                    "DETAILS\n" +
                    "\n" +
                    "Fees:Rs. 500/Participant\n" +
                    "Duration:2 Days (9am-2pm)\n" +
                    "Organizer:Cyberdroid technologies\n" +
                    "Dates:4 Feb - 5 Feb\n" +
                    "Please note that registrations will be confirmed only after payment on first come first serve basis. \n" +
                    "\n" +
                    "Club with Python or Django workshop and get to attend both workshops at a cost of Rs.650. \n" +
                    "For persons who are doing for combo registrations After registration and payment in the following portal for combo pack. Mail the payment slip, name , Vortex ID and the two workshop preference. One from each of the following options\n" +
                    "\n" +
                    "Python/Django\n" +
                    "Game Dev/ Augmented Reality/Ethical hacking\n" +
                    "to vortexnitt.workshops@gmail.com \n" +
                    "Note : Only one combo pack per person is applicable \n" +
                    "\n" +
                    "Please bring a laptop when you come for the workshop.",
            "Two whole days of fun, frolic and gaming! A gaming workshop to beat them all. Learn to make all sorts of games - from logic, design and interactivity! Before leaving, pit your games against each other. Everybody gets gaming goodies. Is this fun or what! Experience the view of gaming from the side which pumps your excitement and adrenaline.\n" +
                    "\n" +
                    "COURSE CONTENT\n" +
                    "\n" +
                    "1.Introduction to Unity 3D Understanding Unity development eco system\n" +
                    "2.Versions of Unity Features\n" +
                    "3.Working with Unity 3D Installing Unity\n" +
                    "4.Introduction to the Object-oriented Paradigm\n" +
                    "5.Unity Entities\n" +
                    "6.Meshes\n" +
                    "7.Materials\n" +
                    "8.Lights\n" +
                    "9.Basic elements of Game Development Scripting in Unity\n" +
                    "10.Scripting basics & Creation\n" +
                    "11.Transform\n" +
                    "12.Renderer\n" +
                    "13.Physics\n" +
                    "14.Time Correction Unity 3D Game Development:\n" +
                    "15.Example: Scripting a demo game\n\n" +
                    "Exploring Documentation / Learning More\n" +
                    "Building Your Game / Compiling\n" +
                    "Closing Notes WorldViz Vizard VR Toolkit Introduction of Python\n" +
                    "Installing python framework\n" +
                    "Understanding python lifecycles\n" +
                    "Expressions , statements and variables\n" +
                    "Working with numbers, Strings\n" +
                    "Understanding list and tuples\n" +
                    "Making decisions : If / else statements.\n" +
                    "Defining functions and passing arguments. Understanding WorldViz Vizard IDE\n" +
                    "Understanding Vizard workbench\n" +
                    "options windows\n" +
                    "Package Managers\n" +
                    "Create and run a script\n" +
                    "Docking a running scripts\n" +
                    "3d Models\n" +
                    "Osg Workflow VizConnect control setup\n" +
                    "Display and trackers\n" +
                    "Tool Events\n" +
                    "Avatar Gestures\n" +
                    "Transport Commands Coordinate Systems\n" +
                    "3d Models\n" +
                    "2D & 3D texts\n" +
                    "Changing the fonts\n" +
                    "Attaching a Head / Head Morphing\n" +
                    "Using Built in Animations\n" +
                    "Using Inspector Working with sketchUp Make software Working with Google sketch up models using VR\n" +
                    "DETAILS\n" +
                    "\n" +
                    "Fees:Rs. 500/Participant\n" +
                    "Duration:2 Days (9am-2pm)\n" +
                    "Organizer:HT India Labs\n" +
                    "Dates:4 Feb - 5 Feb\n" +
                    "Please note that registrations will be confirmed only after payment on first come first serve basis. \n" +
                    "\n" +
                    "Club with Python or Django workshop and get to attend both workshops at a cost of Rs.650. \n" +
                    "For persons who are doing for combo registrations After registration and payment in the following portal for combo pack. Mail the payment slip, name , Vortex ID and the two workshop preference. One from each of the following options\n" +
                    "\n" +
                    "Python/Django\n" +
                    "Game Dev/ Augmented Reality/Ethical hacking\n" +
                    "to vortexnitt.workshops@gmail.com \n" +
                    "Note : Only one combo pack per person is applicable \n" +
                    "\n" +
                    "Please bring a laptop when you come for the workshop.",
            "Technology is now as agile as time, the discovery of Google glasses is one such live example why augmented reality is one of the present cutting edge technology. Enhancing one\\'s current perception of reality, AR technology allows for a digitally manipulable, enhanced and interactive view of users real world. Along with acting as a tool of amplifying digital information it is a connecting link between reality and virtuality of our environment. This workshop will enable participants to work with AR modules, build modules including overlaying text, video, 2D and 3D elements. Animation and interaction with elements by making responsive ARs will be an amazing thing to learn from this workshop.\n" +
                    "\n" +
                    "COURSE CONTENT\n" +
                    "\n" +
                    "1.Introduction to JAVA\n" +
                    "2.Why Java?\n" +
                    "3.Variables and Constants\n" +
                    "4.Introduction to Processing:\n" +
                    "5.Why Processing?\n" +
                    "6.Programming Syntax\n" +
                    "7.Getting Started with Processing\n" +
                    "8.NyARToolkit library\n" +
                    "9.GS Video Plugin Variables:\n" +
                    "10.Creating Shapes\n" +
                    "11.Overview on OpenGL\n" +
                    "Building Sample Applications Augmented Reality:\n" +
                    "1.Introduction\n" +
                    "2.Different AR degrees\n" +
                    "3.Augmented / Virtual Reality\n" +
                    "4.Sneak Peek on Google Glass\n" +
                    "5.NyARToolkit:\n" +
                    "6.Overview on Tool Kit\n" +
                    "7.Architecture\n" +
                    "8.Interfacing NyARToolkit Library\n" +
                    "9.Graphics & Rendering:\n" +
                    "10.Overlaying 2D & 3D Surfaces\n" +
                    "11.Color Space Conversions\n" +
                    "12.Recognizing Different Patterns\n" +
                    "DETAILS\n" +
                    "\n" +
                    "Fees:Rs. 500/Participant\n" +
                    "Duration:2 Days (9am-2pm)\n" +
                    "Organizer:HT India Labs\n" +
                    "Dates:4 Feb - 5 Feb\n" +
                    "Please note that registrations will be confirmed only after payment on first come first serve basis. \n" +
                    "\n" +
                    "Club with Python or Django workshop and get to attend both workshops at a cost of Rs.650. \n" +
                    "For persons who are doing for combo registrations After registration and payment in the following portal for combo pack. Mail the payment slip, name , Vortex ID and the two workshop preference. One from each of the following options\n" +
                    "\n" +
                    "Python/Django\n" +
                    "Game Dev/ Augmented Reality/Ethical hacking\n" +
                    "to vortexnitt.workshops@gmail.com \n" +
                    "Note : Only one combo pack per person is applicable \n" +
                    "\n" +
                    "Please bring a laptop when you come for the workshop.",
            "Cloud computing is a type of computing that relies on sharing computing resources rather than having local servers or personal devices to handle applications Join us and understand the core concepts of “Cloud Computing” plus the different attributes such as reliability, fault tolerance, elastic and scalability .Whether you are an aspirant for IT innovation, the AWS Cloud provides a complete set of infrastructure services at zero upfront costs which are available with a few clicks and within minutes\n" +
                    "\n" +
                    "COURSE CONTENT\n" +
                    "\n" +
                    "Installing windows and linux servers\n" +
                    "Configuring web services\n" +
                    "Executing the above steps in AWS console (Cloud computing)\n" +
                    "DETAILS\n" +
                    "\n" +
                    "Fees:Rs. 300/Participant\n" +
                    "Duration:1 Day (1pm-6pm)\n" +
                    "Organizer:CADD Centre\n" +
                    "Dates:5 Feb\n" +
                    "Please note that registrations will be confirmed only after payment on first come first serve basis."
    };
    public static String[] labels=
            {
                    "code surf",
                    "ospc",
                    "machine learning",
                    "paper presentation",
                    "triathlon",
                    "clueless",
                    "hunt the code",
                    "webbed",
                    "main quiz",
                    "tech dumb c",
                    "mathzz",
                    "ctf"

            };

    public static String[] w_labels=
            {
                    "python",
                    "django",
                    "ethical hacking",
                    "game dev",
                    "augmented reality",
                    "cloud computing",

            };
    private String about_text="An amalgamation of workshops, events, guest lectures, Vortex was founded in the need to provide the students a ground to share, cultivate and enrich their comprehension with other like-minded enthusiasts. Vortex was established to foster skills and knowledge in students by interactions with Academicians and Industry Experts, by hands-on approach through Workshops and by polishing their competitive edge through on-site as well as online events.\n\n With every edition, Vortex evolves to develop itself as a more gainful platform for the students. Whether it be inviting speakers from different fields for guest lectures, workshops, events and outreach events to reach more students as well as more interests of the students; Vortex believes in doing things differently.\n To not take the conventional route, to understand the need of the students, to bridge students to the Industry better, to help students better understand and employ industry approaches; every year Vortex team works to tackle new challenges and learn from the mistakes of past.\n\n Vortex'17 marks the 25th edition of Vortex.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));


        int from_id=getIntent().getIntExtra("from_id",0);
        if(from_id==0) {
            setContentView(R.layout.activity_details);
            int event_id=getIntent().getIntExtra("event_id",0);
            ((TextView) findViewById(R.id.title_details)).setText(labels[event_id]);
            ((TextView) findViewById(R.id.content_details)).setText(contentStrings[event_id]);
        }
        else if(from_id==1){
                setContentView(R.layout.activity_details);
                int event_id=getIntent().getIntExtra("event_id",0);
                ((TextView) findViewById(R.id.title_details)).setText(w_labels[event_id]);
                ((TextView) findViewById(R.id.content_details)).setText(w_contentStrings[event_id]);
            }
            else if(from_id==2) {
            setContentView(R.layout.activity_contacts);

            ((LinearLayout)findViewById(R.id.layoutshurya)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipboardManager cboard=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                    cboard.setPrimaryClip(ClipData.newPlainText("contact","+91 9585404285"));
                    Toast.makeText(getApplicationContext(),"Number copied",Toast.LENGTH_SHORT).show();

                }
            });
            ((LinearLayout)findViewById(R.id.layoutkoushik)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipboardManager cboard=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                    cboard.setPrimaryClip(ClipData.newPlainText("contact","+91 9500179320"));
                    Toast.makeText(getApplicationContext(),"Number copied",Toast.LENGTH_SHORT).show();
                }
            });
            ((LinearLayout)findViewById(R.id.layoutharsh)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipboardManager cboard=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                    cboard.setPrimaryClip(ClipData.newPlainText("contact","+91 9965797417"));
                    Toast.makeText(getApplicationContext(),"Number copied",Toast.LENGTH_SHORT).show();
                }
            });
            ((LinearLayout)findViewById(R.id.layoutdharanie)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipboardManager cboard=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                    cboard.setPrimaryClip(ClipData.newPlainText("contact","+91 9486692727"));
                    Toast.makeText(getApplicationContext(),"Number copied",Toast.LENGTH_SHORT).show();
                }
            });

        }
        else {
            setContentView(R.layout.activity_details);
            ((TextView) findViewById(R.id.title_details)).setText("About");

            ((TextView) findViewById(R.id.content_details)).setText(about_text);
        }
    }

    @Override
    public void finish() {
        super.finish();
        //overridePendingTransition(R.anim.splash_in,R.anim.splash_out);
    }
}
