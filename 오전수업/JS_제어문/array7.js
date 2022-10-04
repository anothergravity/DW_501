// array.js


// window.onload : html문서의 모든내용이 브라우저에 표시된이후에 동작
// window객체 : 브라우저실행시키기위한 프로그램 틀
// window에만 onload 있는거아님, 모든 객체(html태그포함)에 존재
// load -> 불러오기 즉 onload는 불러오는 작업이 끝났을때 동작

var item_list = ["핸드폰거치대", "급속충전기" ,"C타입케이블", "강화유리", 
    "스마트폰 링", "스마트폰 커버"];

window.onload = function(){
    var li = document.getElementsByClassName("item");
    // var li = document.querySelectorAll(".item");

        // for( var i=0; i< li.length; i++)
        for (var i in li) { // for ( in ) : 배열구조에서 사용
            li[i].innerHTML = item_list[i];

        }
};

var item = new Array();
function enroll(){
    var name = document.getElementById('item_name');
    // var name = document.querySelector("#item_name");

    var prop = name.value;
    item.push(prop);

        var price = document.querySelector('#item_price');

    var ul = document.querySelector('#item_list');
    
    var li = document.createElement('li') // li 태그 생성


    li.innerHTML = item[item.length - 1]; // li태그안에 제품명 삽임
    //li.innerHTML = item[item.length - 1] +" "+price.value+"원";

        var b = document.createElement("b");
        b.innerHTML = price.value + "원";
        li.appendChild(b);
    var bt = document.createElement('button');
    bt.setAttribute('class','del_bt');
    bt.setAttribute('onclick','del(this)');

    bt.innerHTML = '삭제';
    li.appendChild(bt);

    ul.appendChild(li); // ul 태그 자식으로 li 추가

// 새 태그(엘리먼트,요소,객체)를 생성하는 방법: createElement() 함수

    // 태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법: innerHTML 속성
    // 태그(엘리먼트) 내부에 새로운 내용을 추가 하는 방법 : appendChild 함수
    // 태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는방법 : appendChild(textnode);
}

function del(obj){
var parent_li = obj.parentNode;
    var parent_ul = parent_li.parentNode;
    parent_ul.removeChild(parent_li);
}
/*
    실습.
    제품 등록 하면서 제품 가격과 함께 등록 할수 있게 만들기
    제품 가격 입력하는 input 만들어서 등록
    예시) 거치대 3000원 삭제
*/