package KotlinSamples

import android.view.View
import android.widget.Button
import com.example.kotlintutorial.AppClass

class PracticePitch {
    init {
//        IteratorImplementation()
//        StackSamples()
//        val map = HMCustom<String, String>()
//        map.put("A", "Anna")
//        map.put("B", "Baaleyele")
//        map.put("C", "Chitranna")
//        map.put("D", "Dose")
//        map.put("E", "Elakki")

        val input2DArray = arrayOf(intArrayOf(5, 0, 7), intArrayOf(3, 8, 1), intArrayOf(4, 9, 6))

        val inputArray = intArrayOf(4, 1, 3, 5, 1, 2, 3, 2, 1, 1, 5)
//        ArrayPrograms().sortAsWaveArray(inputArray)

        val arrayWithOnesAndZeros = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0 ,1), intArrayOf(1, 1, 1))
//        MatrixSamples().zeroMatrix(arrayWithOnesAndZeros)

//        MatrixSamples().rotateArrayBy90ClockWise(input2DArray)
//        MatrixSamples().rotateArrayBy90AntiClockWise(input2DArray)

//        ArrayPrograms().minimumAbsoluteDifferencePairs(inputArray)
//        ArrayPrograms().containerMostWaterBetterApproach(intArrayOf(6, 9, 3, 6, 13))
//        ArrayPrograms().containerMostWaterBetterApproach(intArrayOf(3, 1, 2, 4, 5))

//        ArrayPrograms().minAndMax(inputArray)

//        val op = ArrayPrograms().reverseArrayInPlace(inputArray)
//        println(op)

//        val sequenceArray = intArrayOf(5,4,1,2)
//        ArrayPrograms().findMissingNumberinSequenceUnsortedArray(sequenceArray)

//        ArrayPrograms().maximumSumSlidingProblemBetterApproach(inputArray, 3)

//          ArrayPrograms().slidingWindowMaximumUSingDeque(inputArray, 3)
//        findKthLargest()
//        fibo(5)
//        val fibResult = fibRec(1,0,5)
//        println(fibResult)

//        val factResult = factorial(5)
//        val factResult = ArrayPrograms().factorialRec(6)
//        println(factResult)
//        ArrayPrograms().nextGreatestElement(intArrayOf(13, 7, 6, 12))
//        ArrayPrograms().minimumAbsoluteDifferencePairs(intArrayOf(2, 6, 9, 11, 19, 21, 23))

//        ArrayPrograms().moveAllZerosToEnd(intArrayOf(1, 0, 2, 0, 0, 9, 7, 0))
//        ArrayPrograms().removeDuplicatesSortedArray(intArrayOf(1, 2, 2, 3, 4, 5, 5 ,7))

//        val arr:IntArray = IntArray(10)
//        val arr1:Array<Int> = Array(10){-1}

//        ArrayPrograms().findMaximumDiffInIncreasingElements(intArrayOf(87, 68, 91, 56, 43, 98, 4, 60))

//        ArrayPrograms().towerOfHanoi('A', 'C', 'B', 3)

//        ArrayPrograms().minAndMax(intArrayOf(4, 9, 6, 90))
//        ArrayPrograms().runningMedian(intArrayOf(48, 56, 71, 79, 87, 91, 97), 7);

//        val result = bs(intArrayOf(48, 56, 71, 79, 87, 91, 97), 98)
//        println("result$result")

//        val list1 = arrayListOf("1212","34242")
//        list1.add("aa")
//        val list2 = ArrayList<String>(10)
//        list2.add("aa")
//        val list = List<String?>(10){null}

//        FilterAndMapSample()
//        SetSample()
//        MapSample()
//        MatrixSamples().numIslands(arrayOf(charArrayOf('1', '1', '0', '0', '0'), charArrayOf('1', '1', '0', '0', '0'),
//            charArrayOf('0', '0', '1', '0', '0'),  charArrayOf('0', '0', '0', '1', '1')))

//          MatrixSamples().generatePascalTriangle(5)

//        ArrayPrograms().tripletSum(intArrayOf(1,1,2,2,3,3), 6)
//        ArrayPrograms().tripletSum(intArrayOf(1,1,2,2,3,3,4,4,5,5), 8)

//        StringProblems().zigzagConversionStringBuilder("PAYPALISHIRING", 5)

//        ArrayPrograms().findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15))

//        ArrayPrograms().TrappingRainWater(intArrayOf(3, 0, 2, 0, 4))

//        StringProblems().lengthOfLongestSubstring("abcabcbb")

//        ArrayPrograms().minimumOperationsToZero1(intArrayOf(5207,5594,477,6938,8010,7606,2356,6349,3970,751,5997,6114,9903,3859,6900,7722,2378,1996,
//                8902,228,4461,90,7321,7893,4879,9987,1146,8177,1073,7254,5088,402,4266,6443,3084,1403,5357,
//                2565,3470,3639,9468,8932,3119,5839,8008,2712,2735,825,4236,3703,2711,530,9630,1521,2174,5027,
//                4833,3483,445,8300,3194,8784,279,3097,1491,9864,4992,6164,2043,5364,9192,9649,9944,7230,7224,
//                585,3722,5628,4833,8379,3967,5649,2554,5828,4331,3547,7847,5433,3394,4968,9983,3540,9224,6216,
//                9665,8070,31,3555,4198,2626,9553,9724,4503,1951,9980,3975,6025,8928,2952,911,3674,6620,3745,6548,
//                4985,5206,5777,1908,6029,2322,2626,2188,5639),31841)

//        CouroutineSamples()
//          ArrayPrograms().maximumUniqueSubarray(intArrayOf(10000,1,10000,1,1,1,1,1,1))
//          ArrayPrograms().maximumUniqueSubAraySum(intArrayOf(5,2,1,2,5,2,1,2,5))
//        StringProblems().isAnagram_sortApproach("anagram", "nagaram")
//        StringProblems().groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))
//        StringProblems().findAnagrams("abab", "ab")
//        StringProblems().findAnagrams_slidingWindow("cbaebabacd", "abc")
//        NetoworkLibUseCase()
//        QueueSamples()
//        LRUCacheImplementation()
//        getNumberOfShifts()
//        CouroutineSamples()
//        KotlinOperatorOverloading()
//        ExtensionFunctionSample()
//          SampleSealedClass()
//        KotlinVaragsExample()
//        MapSample()
//        KotlinInfixSample()
//        ClassDelegateSample()
//        SingeltonExperiment.getInstance().hello()
//        KotlinDataClassSample()
//        KotlinDestructionDeclarationSamples()
//        KotlinReflections()
        KotlinAnnotations()
    }

    fun <T> genericsExample(value: T) {
        println(value)
    }

//    setTime = "07:30" and timeToSet = "08:00"
//    setTime = "23:45" and timeToSet = "08:00"
    fun getNumberOfShifts(){
        val old = "23:45"
        val new = "08:00"
        val splitOld = old.split(":")
        val splitNew = new.split(":")
        val oldHours = splitOld[0].toInt()
        val oldMins = splitOld[1].toInt()
        val newHours = splitNew[0].toInt()
        val newMins = splitNew[1].toInt()

        val diffHours = Math.abs(newHours - oldHours)
        val diffMins = Math.abs(newMins - oldMins)
        var hoursShift = 0
    //    setTime = "07:30" and timeToSet = "20:00"
        if(diffHours > 12){
            if(newHours > oldHours){

            }else{

            }
        }
    }
}


class SingeltonExperiment{
    private constructor()
    companion object {
        private var singeltonExperiment:SingeltonExperiment? = null
        @Synchronized
        fun getInstance(): SingeltonExperiment {
            if (singeltonExperiment == null) {
                singeltonExperiment = SingeltonExperiment()
            }
            return singeltonExperiment!!
        }
    }
    fun hello(){
        val touchListener = View.OnTouchListener { v, event -> false }
        val button:Button = Button(AppClass.application)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }
        })
    }
}


