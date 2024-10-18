package com.example.a30daysapp

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_second_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Helper function to apply multiple bold spans to a TextView
        fun applySpannableText(view: TextView, text: String, boldStart1: Int, boldEnd1: Int, boldStart2: Int, boldEnd2: Int) {
            val spannableString = SpannableString(text)

            // First bold span
            spannableString.setSpan(StyleSpan(Typeface.BOLD), boldStart1, boldEnd1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableString.setSpan(StyleSpan(Typeface.NORMAL), boldEnd1, boldStart2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            // Second bold span
            spannableString.setSpan(StyleSpan(Typeface.BOLD), boldStart2, boldEnd2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            spannableString.setSpan(StyleSpan(Typeface.NORMAL), boldEnd2, text.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            view.text = spannableString
        }

        // Applying the SpannableStrings for each TextView
        applySpannableText(findViewById(R.id.textview1), "Challenge: Track how you spend every hour of your day. Write down all activities and time spent. \nGoal: Understand where your time goes.", 0, 9, 98, 104)
        applySpannableText(findViewById(R.id.textview2), "Challenge: Define your top 3 goals for the month. \nGoal: Clarify what you want to achieve.", 0, 9, 51, 57)
        applySpannableText(findViewById(R.id.textview3), "Challenge: Use the Eisenhower Matrix (urgent-important chart) to prioritize your daily tasks. \nGoal: Learn to prioritize effectively.", 0, 9, 95, 100)
        applySpannableText(findViewById(R.id.textview4), "Challenge: Implement time blocking for a day (e.g., work, personal, and leisure). \nGoal: Structure your day to reduce distractions.", 0, 9, 83, 88)
        applySpannableText(findViewById(R.id.textview5), "Challenge: If a task will take 2 minutes or less, do it immediately. \nGoal: Learn to eliminate small tasks quickly.", 0, 9, 70, 76)
        applySpannableText(findViewById(R.id.textview6), "Challenge: Use the Pomodoro technique (25 minutes of work, 5-minute break). \nGoal: Improve focus and reduce burnout.", 0, 9, 77, 83)
        applySpannableText(findViewById(R.id.textview7), "Challenge: Batch similar tasks together (e.g., answering emails, making phone calls). \nGoal: Minimize mental switching costs.", 0, 9, 89, 93)
        applySpannableText(findViewById(R.id.textview8), "Challenge: Spend a day focusing on one task at a time. \nGoal: Improve focus and efficiency.", 0, 9, 56, 62)
        applySpannableText(findViewById(R.id.textview9), "Challenge: Implement a rest period every 90 minutes of work. \nGoal: Improve energy levels and productivity.", 0, 9, 62, 68)
        applySpannableText(findViewById(R.id.textview10), "Challenge: Reflect on the past 9 days. What’s working? What’s not? \nGoal: Recognize patterns in your time management.", 0, 9, 68, 74)
        applySpannableText(findViewById(R.id.textview11), "Challenge: Identify your most common distractions and reduce them. \nGoal: Enhance focus.", 0, 9, 68, 74)
        applySpannableText(findViewById(R.id.textview12), "Challenge: Focus only on your top 3 tasks for the day. \nGoal: Avoid overwhelm by narrowing your focus.", 0, 9, 56, 62)
        applySpannableText(findViewById(R.id.textview13), "Challenge: Identify the 20% of tasks that give you 80% of the results. \nGoal: Focus on high-impact activities.", 0, 9, 72, 78)
        applySpannableText(findViewById(R.id.textview14), "Challenge: Plan 15 minutes of recovery for every hour of focused work. \nGoal: Prevent burnout and maintain focus throughout the day.", 0, 9, 72, 78)
        applySpannableText(findViewById(R.id.textview15), "Challenge: Organize your digital workspace (emails, files, apps). \nGoal: Remove distractions and increase efficiency.", 0, 9, 67, 73)
        applySpannableText(findViewById(R.id.textview16), "Challenge: Stack a new time management habit on top of an existing one (e.g., plan tomorrow’s tasks right after your evening routine). \nGoal: Build habits by anchoring them to existing routines.", 0, 9, 136, 142)
        applySpannableText(findViewById(R.id.textview17), "Challenge: Develop a productive morning routine that sets the tone for the day. \nGoal: Start the day with intentionality.", 0, 9, 81, 87)
        applySpannableText(findViewById(R.id.textview18), "Challenge: Create an evening routine that helps you wind down and plan for the next day. \nGoal: End the day mindfully, preparing for the next.", 0, 9, 90, 96)
        applySpannableText(findViewById(R.id.textview19), "Challenge: Conduct a weekly review: What did you accomplish? What needs to change? \nGoal: Reflect weekly for continuous improvement.", 0, 9, 84, 90)
        applySpannableText(findViewById(R.id.textview20), "Challenge: Practice saying “no” to unimportant tasks to protect your time. \nGoal: Set clear boundaries to guard your time.", 0, 9, 76, 82)
        applySpannableText(findViewById(R.id.textview21), "Challenge: Set tighter deadlines for tasks to avoid them expanding unnecessarily. \nGoal: Work faster by creating artificial time constraints.", 0, 9, 83, 89)
        applySpannableText(findViewById(R.id.textview22), "Challenge: Use apps/tools to automate repetitive tasks or time tracking. \nGoal: Streamline daily operations.", 0, 9, 74, 80)
        applySpannableText(findViewById(R.id.textview23), "Challenge: Dedicate one session to a deep work block (90 minutes of focused work). \nGoal: Enhance concentration and high-quality output.", 0, 9, 84, 90)
        applySpannableText(findViewById(R.id.textview24), "Challenge: Delegate at least one task you’ve been handling on your own. \nGoal: Offload tasks to free up time for more important work.", 0, 9, 73, 79)
        applySpannableText(findViewById(R.id.textview25), "Challenge: Batch household chores or errands into one block. \nGoal: Maximize efficiency for routine tasks.", 0, 9, 62, 68)
        applySpannableText(findViewById(R.id.textview26), "Challenge: Set aside time each day for self-care (exercise, hobbies, rest). \nGoal: Prioritize well-being for sustainable productivity.", 0, 9, 77, 83)
        applySpannableText(findViewById(R.id.textview27), "Challenge: Practice saying no to tasks that don’t align with your goals. \nGoal: Protect your time from unnecessary commitments.", 0, 9, 74, 80)
        applySpannableText(findViewById(R.id.textview28), "Challenge: Create a time budget for your day/week, allocating specific time slots for tasks. \nGoal: Control your time, don’t let it control you.", 0, 9, 94, 100)
        applySpannableText(findViewById(R.id.textview29), "Challenge: Pair up with someone to share your goals and check in. \nGoal: Increase motivation and accountability.", 0, 9, 66, 73)
        applySpannableText(findViewById(R.id.textview30), "Challenge: Celebrate your achievements, reflect on your growth. \nGoal: Acknowledge improvements and plan your next steps.", 0, 9, 65, 71)


    }
}