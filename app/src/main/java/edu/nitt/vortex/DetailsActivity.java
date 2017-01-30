package edu.nitt.vortex;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        setContentView(R.layout.activity_details);
        int event_id=getIntent().getIntExtra("event_id",0);
        ((TextView)findViewById(R.id.title_details)).setText(labels[event_id]);
        ((TextView)findViewById(R.id.content_details)).setText(contentStrings[event_id]);
    }
}
