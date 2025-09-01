## นิยามของ for loop

 for loop คือคำสั่งควบคุมการทำงานของโปรแกรมที่ช่วยให้สามารถทำงานซ้ำ ๆ ได้ภายใต้เงื่อนไขที่ผู้เขียนโปรแกรมกำหนด ประโยชน์ที่เราได้จากการใช้ for loop ได้แก่  ทำงานซ้ำตามจำนวนที่แน่นอน เช่น พิมพ์ข้อความ 10 ครั้ง ลดความซ้ำซ้อนของโค้ด ไม่ต้องเขียนคำสั่งเดิม ๆ หลายบรรทัด, แก้ไขหรืออัปเดตเงื่อนไขได้เพียงจุดเดียว ทำให้โค้ดอ่านง่าย 

## for loop ในภาษา Ruby

for loop ของ Ruby มักถูกใช้งานเมื่อต้องการให้ชุดคำสั่งทำงานซ้ำ โดยสามารถวนผ่านคอลเลกชันของข้อมูล เช่น อาเรย์ (Array) หรือ เรนจ์ (Range) ได้โดยตรงโดย
ในการวนซ้ำ จะมี ตัววน (iterator) ทำหน้าที่เข้าถึงค่าทีละตัว เพื่อนำค่าไปใช้ในการคำนวณ การนับ การอัปเดตค่า หรือการประมวลผลอื่น ๆ ตามที่กำหนด

## Basic Syntax
``` ruby
for variable_name in expression 

   # code to be executed

end
```
>
>+ for :คือคีย์เวิร์ดที่ใช้เพื่อเริ่มต้นการทำงานของลูป
>
>+ variable_name :คือตัวแปรที่ทำหน้าที่เป็น ตัววน (iterator) โดยเป็นตัวแปรที่ทำหน้าที่ในการเข้าถึงข้อมูลแต่ละตัว
>
>+ in :คือคีย์เวิร์ดที่บอกว่าเราจะวนซ้ำแบบไหนเช่น ช่วง(Range)  หรือ อาเรย์(Array)  เป็นต้น
>
>+ expression :คือนิพจน์ที่จะกำหนดชนิดข้อมูลที่เราจะนำมาวน เช่น 1..5 หรือ [10, 20, 30] 
>
>+ end: ใช้เพื่อปิดบล็อกคำสั่งที่อยู่ภายในลูป
>

<br>

``` ruby
for i in 1..5
    puts i
end
```
<details>
<summary>Output</summary>
<pre>
1<br>2<br>3<br>4<br>5
</pre>
</details>

<br>

>
>ซึ่งการใช้ Range นั้นจะมีการใช้งาน 2 แบบคือ
>
>1. การที่ใช้ 2 จุดคือ 1..5 => เราจะได้ตัวเลขมา 5 ตัวคือ 1 2 3 4 5 ส่วนอันที่
>
>2. การที่ใช้ 3 จุดคือ 1...5 => จะได้ตัวเลขมาคือ 1 2 3 4
>

<br>

# ตัวอย่างการใช้งาน  for loop



## Range

 ``` ruby
for i in 1...10
    print "#{i} "
end
```
<details>
<summary>Output</summary>
<pre>
1 2 3 4 5 6 7 8 9
</pre>
</details>



## Array
 ``` ruby
languages = ["Ruby","Python", "Java", "C"]

for i in languages 
    puts i
end
```
<details>
<summary>Output</summary>
<pre>
Ruby<br>Python<br>Java<br>C
</pre>
</details>



## Hash
 ``` ruby
movies = {"Star Wars": 1, "Avatar": 2, "Harry Potter": 3}

for k, v in movies
    puts "#{k} => #{v}"
end
```
<details>
<summary>Output</summary>
<pre>
Star Wars => 1<br>Avatar => 2<br>Harry Potter => 3
</pre>
</details>

<br>
<br>

# การเปรียบเทียบ Ruby กับภาษาชนิดอื่น

## C
``` c
int main() {
int i; 
for (i = 1; i < 5; i++) {
        printf("%d\n", i);
    }
return 0;
}
```
<details>
<summary>Output</summary>
<pre>
1<br>2<br>3<br>4
</pre>
</details>


## JAVA
``` java
class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```
<details>
<summary>Output</summary>
<pre>
1<br>2<br>3<br>4
</pre>
</details>

## PYTHON
``` python
for i in range(1, 5):   
   print(i)
```
<details>
<summary>Output</summary>
<pre>
1<br>2<br>3<br>4
</pre>
</details>

<br>

# สรุปความแตกต่าง

## C  และ java
#### โดยจากการที่ได้นำโค้ดด้านบนนำมาเปรียบเทียบแล้วเราสามารถสรุปได้ว่า ภาษา C และ java จะมีความคล้ายหรือใกล้เคียงกันซึ่งภาษาทั้งสองนี้จะไม่มี ตัวแปร end อยู่บรรทัดสุดท้ายเพื่อเป็นการบอกว่าจบ loop เหมือนกับ Ruby แต่จะเป็นการใช้ {} (Braces)  แทนเพื่อเป็นจำกัดขอบเขตของ Block และยังมีส่วนที่ต่างอีกอย่างคือตรงภาษา C และ java จะมี  ; (semi colon)  คั่นตรงกลางระหว่าง expression รวมถึง ในภาษา C และ java จะมีการกำหนดตัวแปรเพื่อเป็นการนับเพือให้ครบจำนวนรอบ ส่วนตรงอื่นๆ อาจจะมีความคล้ายกันอยู๋ไม่ว่าจะมีการกำหนดค่าตัวแปรมาเพื่อเป็นตัวนับรวมถึงการกำหนดเงื่อนไข

## python
#### ส่วนภาษา python นั้นจะมีความแตกต่างจากภาษา Ruby คือมีการใช้ : (colon) มาอยู่หลัง  for และยังมีการ Tab ด้านหน้าเพื่อเป็นการกำหนดว่าอยู๋ใน loop และยังไม่มี end ต้อท้ายเหมือนกับ Ruby ส่วนอื่นๆนั้นจะมีความคล้ายคลึงกับ ภาษา Ruby เลย


# ตารางเปรียบเทียบ for loop ระหว่างภาษา

| ภาษา       | โครงสร้างพื้นฐาน | ขอบเขตบล็อก (Block) | การใช้ตัวแปร | เครื่องหมายพิเศษ | ตัวอย่างโค้ด | Output |
|------------|------------------|----------------------|---------------|-------------------|---------------|--------|
| **Ruby**   | `for var in collection ... end` | ใช้ `end` ปิดบล็อก | ไม่ต้องประกาศชนิดตัวแปร | `..` (inclusive) / `...` (exclusive) | ```ruby\nfor i in 1..5\n  puts i\nend\n``` | ```\n1\n2\n3\n4\n5\n``` |
| **C**      | `for (expr1; expr2; expr3) { ... }` | ใช้ `{}` (curly braces) | ต้องประกาศชนิด เช่น `int i` | `;` (semicolon) คั่นแต่ละ expression | ```c\nfor (int i = 1; i < 5; i++) {\n  printf("%d\\n", i);\n}\n``` | ```\n1\n2\n3\n4\n``` |
| **Java**   | `for (expr1; expr2; expr3) { ... }` หรือ `for (Type var : collection)` | ใช้ `{}` (curly braces) | ต้องประกาศชนิด เช่น `int i` | `;` (semicolon) คั่นแต่ละ expression | ```java\nfor (int i = 1; i < 5; i++) {\n  System.out.println(i);\n}\n``` | ```\n1\n2\n3\n4\n``` |
| **Python** | `for var in iterable:` | ใช้ **indent (tab/space)** | ไม่ต้องประกาศชนิดตัวแปร | `:` (colon) หลังหัวลูป | ```python \nfor i in range(1, 5):\n    print(i)\n``` | ```\n1\n2\n3\n4\n``` |

---

# หมายเหตุ
- **Ruby** : ใช้ `end` ปิดลูป, มี `..` และ `...` สำหรับกำหนดช่วง  
- **C/Java** : ใช้ `{}` แทน `end`, มีการคั่น expression ด้วย `;`, ต้องประกาศตัวแปรก่อนใช้  
- **Java (enhanced for)** : มี `for (Type var : collection)` สำหรับวน Array/Collection โดยตรง  
- **Python** : ใช้ `:` และ **indent** บอกบล็อก, ไม่ต้องมี `end`  



