package com.example.chetanyagupta.treasurehuntv10;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Chetanya Gupta on 06-Feb-18.
 */

public class DatabaseClass extends SQLiteOpenHelper {
    private transient Context ct;
    private static final String DB_NAME = "RIDDLE_DATABASE";
    private static String riddleSet;

    public DatabaseClass(Context context,String riddle_code){
        super(context, DB_NAME, null, 1);
        this.ct=context;
        riddleSet=riddle_code;

        //this.getWritableDatabase();
    }

    public DatabaseClass(Context context) {
        super(context,DB_NAME, null, 1);
        this.ct = context;
        this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

               System.out.println("in db");
               String query1 = "create table set1(_id integer,question text,answer text)";
               db.execSQL(query1);

               String insertRiddleQuery1 = "insert into set1 values (102, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (107, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (105, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (101, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (106, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (108, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (109, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (104, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (103, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery1);
               insertRiddleQuery1 = "insert into set1 values (110, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery1);





               String query2 = "create table set2 (_id integer,question text,answer text)";
               db.execSQL(query2);

               String insertRiddleQuery2 = "insert into set2 values (204, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (208, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (210, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (203, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (209, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (202, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (206, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (201, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (205, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery2);
               insertRiddleQuery2 = "insert into set2 values (207, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery2);








               String query3 = "create table set3 (_id integer,question text,answer text)";
               db.execSQL(query3);

               String insertRiddleQuery3 = "insert into set3 values (310, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (304, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (301, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (308, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (302, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (303, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (307, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (305, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (309, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery3);
               insertRiddleQuery3 = "insert into set3 values (306, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery3);







               String query4 = "create table set4 (_id integer,question text,answer text)";
               db.execSQL(query4);


               String  insertRiddleQuery4 = "insert into set4 values (407, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (403, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (406, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (409, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (405, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (401, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (404, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (402, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (410, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery4);
               insertRiddleQuery4 = "insert into set4 values (408, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery4);







               String query5 = "create table set5 (_id integer,question text,answer text)";
               db.execSQL(query5);


               String  insertRiddleQuery5 = "insert into set5 values (501, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (505, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (509, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (510, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (507, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (506, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (503, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (508, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (504, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery5);
               insertRiddleQuery5 = "insert into set5 values (502, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery5);







               String query6 = "create table set6 (_id integer,question text,answer text)";
               db.execSQL(query6);


               String  insertRiddleQuery6 = "insert into set6 values (606, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (602, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (608, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (604, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (603, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (610, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (605, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (607, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (601, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery6);
               insertRiddleQuery6 = "insert into set6 values (609, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery6);




               String query7 = "create table set7(_id integer,question text,answer text)";
               db.execSQL(query7);

               String  insertRiddleQuery7 = "insert into set7 values (709, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (701, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (703, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (702, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (704, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (707, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (708, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (710, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (706, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery7);
               insertRiddleQuery7 = "insert into set7 values (705, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery7);






               String query8 = "create table set8 (_id integer,question text,answer text)";
               db.execSQL(query8);


               String  insertRiddleQuery8 = "insert into set8 values (805, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (810, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (807, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (806, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (808, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (804, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (801, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (809, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (802, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery8);
               insertRiddleQuery8 = "insert into set8 values (803, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery8);



               String query9 = "create table set9 (_id integer,question text,answer text)";
               db.execSQL(query9);


               String  insertRiddleQuery9 = "insert into set9 values (908, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (906, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (902, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (905, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (901, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (909, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (910, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (903, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (907, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery9);
               insertRiddleQuery9 = "insert into set9 values (904, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery9);





               String query10 = "create table set10 (_id integer,question text,answer text)";
               db.execSQL(query10);

               String  insertRiddleQuery10 = "insert into set10 values (1003, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1009, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1004, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1007, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1010, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1005, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1002, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1006, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1008, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery10);
               insertRiddleQuery10 = "insert into set10 values (1001, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery10);




               String query11 = "create table set11 (_id integer,question text,answer text)";
               db.execSQL(query11);

               String insertRiddleQuery11 = "insert into set11 values (1101, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1102, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1103, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1104, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1105, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1106, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1107, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1108, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1109, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery11);
               insertRiddleQuery11 = "insert into set11 values (1110, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery11);



               String query12 = "create table set12 (_id integer,question text,answer text)";
               db.execSQL(query12);

               String  insertRiddleQuery12 = "insert into set12 values (1206, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1207, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1209, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1208, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1210, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1201, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1202, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1203, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1204, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery12);
               insertRiddleQuery12 = "insert into set12 values (1205, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery12);




               String query13 = "create table set13 (_id integer,question text,answer text)";
               db.execSQL(query13);


               String  insertRiddleQuery13 = "insert into set13 values (1303, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1301, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1304, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1307, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1302, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1308, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1309, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1305, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1310, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
               db.execSQL(insertRiddleQuery13);
               insertRiddleQuery13 = "insert into set13 values (1306, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
               db.execSQL(insertRiddleQuery13);


        String query14 = "create table set14 (_id integer,question text,answer text)";
        db.execSQL(query14);


        String  insertRiddleQuery14 = "insert into set14 values (1410, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1405, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1408, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1406, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1409, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1403, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1401, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1404, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1407, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
        db.execSQL(insertRiddleQuery14);
        insertRiddleQuery14 = "insert into set14 values (1402, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
        db.execSQL(insertRiddleQuery14);



        String query15 = "create table set15 (_id integer,question text,answer text)";
        db.execSQL(query15);


        String insertRiddleQuery15 = "insert into set15 values (1502, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1506, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1501, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1503, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1504, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1509, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1505, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1510, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1508, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
        db.execSQL(insertRiddleQuery15);
        insertRiddleQuery15 = "insert into set15 values (1507, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
        db.execSQL(insertRiddleQuery15);



        String query16 = "create table set16 (_id integer,question text,answer text)";
        db.execSQL(query16);


        String insertRiddleQuery16 = "insert into set16 values (1607, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1610, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1605, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1609, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1608, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1602, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1606, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1601, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1603, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
        db.execSQL(insertRiddleQuery16);
        insertRiddleQuery16 = "insert into set16 values (1604, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
        db.execSQL(insertRiddleQuery16);




        String query17 = "create table set17 (_id integer,question text,answer text)";
        db.execSQL(query17);


        String insertRiddleQuery17 = "insert into set17 values (1705, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1704, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1702, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1701, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1703, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1707, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1710, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1709, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1706, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
        db.execSQL(insertRiddleQuery17);
        insertRiddleQuery17 = "insert into set17 values (1708, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
        db.execSQL(insertRiddleQuery17);


        String query18 = "create table set18 (_id integer,question text,answer text)";
        db.execSQL(query18);


        String insertRiddleQuery18 = "insert into set18 values (1808, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1809, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1807, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1810, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1806, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1805, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1804, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1802, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1801, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
        db.execSQL(insertRiddleQuery18);
        insertRiddleQuery18 = "insert into set18 values (1803, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
        db.execSQL(insertRiddleQuery18);



        String query19 = "create table set19 (_id integer,question text,answer text)";
        db.execSQL(query19);


        String insertRiddleQuery19 = "insert into set19 values (1904, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1903, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1906, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1902, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1901, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1910, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1908, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1907, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1905, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
        db.execSQL(insertRiddleQuery19);
        insertRiddleQuery19 = "insert into set19 values (1909, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
        db.execSQL(insertRiddleQuery19);


        String query20 = "create table set20 (_id integer,question text,answer text)";
        db.execSQL(query20);


        String insertRiddleQuery20 = "insert into set20 values (2009, \"The Fest is almost over but before you relax check the place where you get cheap easy and a Cheesy Sandwiches. \", \"D93FAB\")";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2008, \"I know this is fun And you think its neat, Look in a place where you sit to eat.\", \"6B79E5\")";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2010, \"Our unity is always known, oriental campus is our other home. Although we starve for good food, Come to our den and unlock your clue.\", \"QAP132\")";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2005, \"Open up my great big door, you may find a car or maybe more. \", \"24FF5E\")";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2007, \"I cure your problem when you are in pain. The wound or headache cant cause anymore strain. \", \"010ADC\")";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2004, \"Run, crawl but make sure you move, it’s the place where Bachhan stood. Lift up your face and have a look, it’s the place where you read the book.\", \"87AEFF\" )";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2003, \"I am the smallest division of the main block, I am a place where the masters of computers rock.\", \"10CD2B\" )";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2006, \"You don’t have to search very long or far, the next clue is found where you park your car.\",\"215FDE\")";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2002, \" I dribble up and down the court. I grab the ball I shoot I score . Can you guess the clue, Hurry Run! Run! Run!\" , \"6A30ES\" )";
        db.execSQL(insertRiddleQuery20);
        insertRiddleQuery20 = "insert into set20 values (2001, \"This hunt is not so hard as you see, go run fast to the exam cell your clue is under the santa’s tree.\", \"1E849A\" )";
        db.execSQL(insertRiddleQuery20);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public ArrayList<Riddles> getAllRiddles(){
        String qry="Select * from "+riddleSet+";";
        SQLiteDatabase sql=super.getReadableDatabase();
        ArrayList<Riddles> allRiddles=new ArrayList<>();
        Cursor c=sql.rawQuery(qry,null);
        while(c.moveToNext()){
            Riddles obj=new Riddles();
            obj.setId(c.getInt(0));
            obj.setRiddle(c.getString(1));
            obj.setAnswer(c.getString(2));
            allRiddles.add(obj);

        }
        return allRiddles;
    }

}
