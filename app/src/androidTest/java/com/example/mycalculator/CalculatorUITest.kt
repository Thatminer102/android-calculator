package com.example.mycalculator


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.`is`
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class CalculatorUITest {
    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testOne() {
        val materialButton = onView(
            allOf(
                withId(R.id.button_9), withText("9"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.button_addition), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val materialButton3 = onView(
            allOf(
                withId(R.id.button_4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton3.perform(click())

        val materialButton4 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton4.perform(click())

        val textView = onView(
            allOf(
                withId(R.id.input), withText("9+4"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView.check(matches(withText("9+4")))

        val textView2 = onView(
            allOf(
                withId(R.id.output), withText("13"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView2.check(matches(withText("13")))
    }

    @Test
    fun testTwo() {
        val materialButton5 = onView(
            allOf(
                withId(R.id.button_8), withText("8"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton5.perform(click())

        val materialButton6 = onView(
            allOf(
                withId(R.id.button_subtraction), withText("-"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton6.perform(click())

        val materialButton7 = onView(
            allOf(
                withId(R.id.button_3), withText("3"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton7.perform(click())

        val materialButton8 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton8.perform(click())

        val textView3 = onView(
            allOf(
                withId(R.id.input), withText("8-3"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView3.check(matches(withText("8-3")))

        val textView4 = onView(
            allOf(
                withId(R.id.output), withText("5"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView4.check(matches(withText("5")))
    }

    @Test
    fun testThree() {
        val materialButton9 = onView(
            allOf(
                withId(R.id.button_2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton9.perform(click())

        val materialButton10 = onView(
            allOf(
                withId(R.id.button_multiply), withText("×"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton10.perform(click())

        val materialButton11 = onView(
            allOf(
                withId(R.id.button_8), withText("8"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton11.perform(click())

        val materialButton12 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton12.perform(click())

        val textView5 = onView(
            allOf(
                withId(R.id.input), withText("2×8"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView5.check(matches(withText("2×8")))

        val textView6 = onView(
            allOf(
                withId(R.id.output), withText("16"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView6.check(matches(withText("16")))
    }

    @Test
    fun testFour() {
        val materialButton13 = onView(
            allOf(
                withId(R.id.button_2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton13.perform(click())

        val materialButton14 = onView(
            allOf(
                withId(R.id.button_5), withText("5"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton14.perform(click())

        val materialButton15 = onView(
            allOf(
                withId(R.id.button_division), withText("÷"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton15.perform(click())

        val materialButton16 = onView(
            allOf(
                withId(R.id.button_5), withText("5"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton16.perform(click())

        val materialButton17 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton17.perform(click())

        val textView7 = onView(
            allOf(
                withId(R.id.input), withText("25÷5"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView7.check(matches(withText("25÷5")))

        val textView8 = onView(
            allOf(
                withId(R.id.output), withText("5"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView8.check(matches(withText("5")))
    }

    @Test
    fun testFive() {
        val materialButton18 = onView(
            allOf(
                withId(R.id.button_subtraction), withText("-"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton18.perform(click())

        val materialButton19 = onView(
            allOf(
                withId(R.id.button_3), withText("3"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton19.perform(click())

        val materialButton20 = onView(
            allOf(
                withId(R.id.button_dot), withText("."),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton20.perform(click())

        val materialButton21 = onView(
            allOf(
                withId(R.id.button_5), withText("5"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton21.perform(click())

        val materialButton22 = onView(
            allOf(
                withId(R.id.button_addition), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton22.perform(click())

        val materialButton23 = onView(
            allOf(
                withId(R.id.button_4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton23.perform(click())

        val materialButton24 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton24.perform(click())

        val textView9 = onView(
            allOf(
                withId(R.id.input), withText("-3.5+4"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView9.check(matches(withText("-3.5+4")))

        val textView10 = onView(
            allOf(
                withId(R.id.output), withText("0.5"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView10.check(matches(withText("0.5")))
    }

    @Test
    fun testSix() {
        val materialButton25 = onView(
            allOf(
                withId(R.id.button_2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton25.perform(click())

        val materialButton26 = onView(
            allOf(
                withId(R.id.button_5), withText("5"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton26.perform(click())

        val materialButton27 = onView(
            allOf(
                withId(R.id.button_subtraction), withText("-"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton27.perform(click())

        val materialButton28 = onView(
            allOf(
                withId(R.id.button_2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton28.perform(click())

        val materialButton29 = onView(
            allOf(
                withId(R.id.button_7), withText("7"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton29.perform(click())

        val materialButton30 = onView(
            allOf(
                withId(R.id.button_dot), withText("."),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton30.perform(click())

        val materialButton31 = onView(
            allOf(
                withId(R.id.button_2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton31.perform(click())

        val materialButton32 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton32.perform(click())

        val textView11 = onView(
            allOf(
                withId(R.id.input), withText("25-27.2"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView11.check(matches(withText("25-27.2")))

        val textView12 = onView(
            allOf(
                withId(R.id.output), withText("-2.2"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView12.check(matches(withText("-2.2")))
    }

    @Test
    fun testSeven() {
        val materialButton33 = onView(
            allOf(
                withId(R.id.button_6), withText("6"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton33.perform(click())

        val materialButton34 = onView(
            allOf(
                withId(R.id.button_6), withText("6"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton34.perform(click())

        val materialButton35 = onView(
            allOf(
                withId(R.id.button_6), withText("6"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton35.perform(click())

        val materialButton36 = onView(
            allOf(
                withId(R.id.button_6), withText("6"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton36.perform(click())

        val materialButton37 = onView(
            allOf(
                withId(R.id.button_6), withText("6"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton37.perform(click())

        val materialButton38 = onView(
            allOf(
                withId(R.id.button_multiply), withText("×"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton38.perform(click())

        val materialButton39 = onView(
            allOf(
                withId(R.id.button_9), withText("9"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton39.perform(click())

        val materialButton40 = onView(
            allOf(
                withId(R.id.button_9), withText("9"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton40.perform(click())

        val materialButton41 = onView(
            allOf(
                withId(R.id.button_9), withText("9"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton41.perform(click())

        val materialButton42 = onView(
            allOf(
                withId(R.id.button_9), withText("9"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton42.perform(click())

        val materialButton43 = onView(
            allOf(
                withId(R.id.button_9), withText("9"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton43.perform(click())

        val materialButton44 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton44.perform(click())

        val textView13 = onView(
            allOf(
                withId(R.id.input), withText("66666×99999"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView13.check(matches(withText("66666×99999")))

        val textView14 = onView(
            allOf(
                withId(R.id.output), withText("6.666533E+9"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView14.check(matches(withText("6.666533E+9")))
    }

    @Test
    fun testEight() {
        val materialButton45 = onView(
            allOf(
                withId(R.id.button_2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton45.perform(click())

        val materialButton46 = onView(
            allOf(
                withId(R.id.button_division), withText("÷"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton46.perform(click())

        val materialButton47 = onView(
            allOf(
                withId(R.id.button_1), withText("1"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton47.perform(click())

        val materialButton48 = onView(
            allOf(
                withId(R.id.button_0), withText("0"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton48.perform(click())

        val materialButton49 = onView(
            allOf(
                withId(R.id.button_0), withText("0"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton49.perform(click())

        val materialButton50 = onView(
            allOf(
                withId(R.id.button_0), withText("0"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton50.perform(click())

        val materialButton51 = onView(
            allOf(
                withId(R.id.button_0), withText("0"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton51.perform(click())

        val materialButton52 = onView(
            allOf(
                withId(R.id.button_0), withText("0"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton52.perform(click())

        val materialButton53 = onView(
            allOf(
                withId(R.id.button_0), withText("0"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton53.perform(click())

        val materialButton54 = onView(
            allOf(
                withId(R.id.button_0), withText("0"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton54.perform(click())

        val materialButton55 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton55.perform(click())

        val textView15 = onView(
            allOf(
                withId(R.id.input), withText("2÷10000000"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView15.check(matches(withText("2÷10000000")))

        val textView16 = onView(
            allOf(
                withId(R.id.output), withText("2E-7"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView16.check(matches(withText("2E-7")))
    }

    @Test
    fun testNine() {
        val materialButton56 = onView(
            allOf(
                withId(R.id.button_2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton56.perform(click())

        val materialButton57 = onView(
            allOf(
                withId(R.id.button_4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton57.perform(click())

        val materialButton58 = onView(
            allOf(
                withId(R.id.button_addition), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton58.perform(click())

        val materialButton59 = onView(
            allOf(
                withId(R.id.button_3), withText("3"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton59.perform(click())

        val materialButton60 = onView(
            allOf(
                withId(R.id.button_1), withText("1"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton60.perform(click())

        val materialButton61 = onView(
            allOf(
                withId(R.id.button_addition), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton61.perform(click())

        val materialButton62 = onView(
            allOf(
                withId(R.id.button_7), withText("7"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton62.perform(click())

        val materialButton63 = onView(
            allOf(
                withId(R.id.button_addition), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton63.perform(click())

        val materialButton64 = onView(
            allOf(
                withId(R.id.button_8), withText("8"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        1
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton64.perform(click())

        val materialButton65 = onView(
            allOf(
                withId(R.id.button_dot), withText("."),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton65.perform(click())

        val materialButton66 = onView(
            allOf(
                withId(R.id.button_5), withText("5"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton66.perform(click())

        val materialButton67 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton67.perform(click())

        val textView17 = onView(
            allOf(
                withId(R.id.input), withText("24+31+7+8.5"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView17.check(matches(withText("24+31+7+8.5")))

        val textView18 = onView(
            allOf(
                withId(R.id.output), withText("70.5"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView18.check(matches(withText("70.5")))
    }

    @Test
    fun testTen() {
        val materialButton68 = onView(
            allOf(
                withId(R.id.button_3), withText("3"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton68.perform(click())

        val materialButton69 = onView(
            allOf(
                withId(R.id.button_4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton69.perform(click())

        val materialButton70 = onView(
            allOf(
                withId(R.id.button_addition), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton70.perform(click())

        val materialButton71 = onView(
            allOf(
                withId(R.id.button_clear), withText("C"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton71.perform(click())

        val materialButton72 = onView(
            allOf(
                withId(R.id.button_1), withText("1"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton72.perform(click())

        val materialButton73 = onView(
            allOf(
                withId(R.id.button_4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton73.perform(click())

        val materialButton74 = onView(
            allOf(
                withId(R.id.button_addition), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        3
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton74.perform(click())

        val materialButton75 = onView(
            allOf(
                withId(R.id.button_4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton75.perform(click())

        val materialButton76 = onView(
            allOf(
                withId(R.id.button_4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        2
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton76.perform(click())

        val materialButton77 = onView(
            allOf(
                withId(R.id.button_backspace), withText("⌫"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton77.perform(click())

        val materialButton78 = onView(
            allOf(
                withId(R.id.button_equals), withText("="),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.TableLayout")),
                        4
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton78.perform(click())

        val textView19 = onView(
            allOf(
                withId(R.id.input), withText("14+4"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView19.check(matches(withText("14+4")))

        val textView20 = onView(
            allOf(
                withId(R.id.output), withText("18"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout::class.java))),
                isDisplayed()
            )
        )
        textView20.check(matches(withText("18")))
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
