"use strict"; 
//  BIG O: BIG O asymptotic analysis

const nemo =['nemo'];
const large = new Array(10000).fill('nemo');
function findNemo(array)
{
    let t0=performance.now();
    for (let i=0;i<array.length;i++)
    {
        if(array[i]==='nemo')
        {
            console.log('found nemo!');
            break;         
        }
    }
    let t1=performance.now();
    console.log(`performance:  ${(t1-t0)}`);
    
}   
findNemo(large);
// lets measure the performance of code! 


// O(n) -----> linear
// as the number of items increse, the number of iterations increses. 
const compraseBoxes=boxes=>{boxes.foreach(box=>console.log(box));} // ES6 function.// 
//linear // O(n)
///////////////////////////////////////////////////////////
// O(1) -- constant time! 
function compressBoxes(boxes)
{
    console.log(boxes[1]);
    
}
//// 
const boxes2=[1,2,3,4,5]
function log2Boxes(boxes)
{
    console.log(boxes[0]); //O(1)
    console.log(boxes[1]);//O(1)
} 
log2Boxes(boxes2); // O(2) -- and so on-- constant time -- it doesn't matter how big the inputs are!


  /////////////////////////////// you can calculate easilly.
  // worst case!     what if was in the last of loop
  // remove constants  O(2n)->O(n)
  // different terms for inputs ---> ex above
  // drop non dominants   O(n + n^2) ---> O(n^2)
  /////////////////////////////////////////////////////

  function compressBoxesTwice(boxes, boxes2) {
    boxes.forEach(function(boxes) {
        console.log(boxes);
    });

    boxes2.forEach(function(boxes) {
        console.log(boxes);
    });
} ///O(a+b)


///// 
const boxes1= [1,2,3,4,5,6,7,8];
function logPairs(array)
{
    for (let i = 0; i < array.length; i++) {

        for (let j =0; j < array.length; j++)
        {
            console.log(array[i]+''+array[j]);
        }
        
    }
} // O(n^2)
logPairs(boxes1);


/// DS: ways to store data
// ways to use ds to run our programs 





/// O(n!)  the most expensive O notation, O no!!
/// nested loop for every element (input) we have! 




/// what is good??
// - readable!
// - scalable --> speed, {{memory!}}


/// Three pillers of programming
   // Readable 
  //  Memory -- space complexity
 //   Speed -- time complexity




// two ways to remember things when program executes!
  // the heap: usually where we store the variables, values
 //  the stack: where we keep track of function calls. 



 /// what cause space complexity 
   //  variables 
   //  DS
   // function calls
   //  allocations

function boo(n) 
{
 for (let i = 0; i < n.length; i++) {
    console.log('boo');
    
    
 }   
}
boo([1,2,4,5,6,7,8,9,9])//O(1)


function ArrayOfNTimes(array)
 {
    let hi=[];
    for (let i = 0; i < array.length; i++) {
        hi[i]='hi';        
    }   
    return hi;
 }
  console.log(ArrayOfNTimes(8)); // O(n) --> because there is a new DS is created -> a new array
//   //#5 Space complexity O(1)
// function boooo(n) {
//     for (let i = 0; i < n; i++) {
//       console.log("booooo");
//     }
//   }
  
//   // #6 Space complexity O(n)
//   function arrayOfHiNTimes(n) {
//     var hiArray = [];
//     for (let i = 0; i < n; i++) {
//       hiArray[i] = "hi";
//     }
//     return hiArray;
//   }
  
//   arrayOfHiNTimes(6);


///// in JS--- - 'sdfgslfdhjsdlh'.length -> O(1)!!