package main 

import "fmt"

// 封装
type Animal struct {
 Feet int
}

func (a *Animal) Run() {
 fmt.Printf("动物用%d只脚跑\n", a.Feet)
}

// 继承，monkey和zig具体实现Run()函数
// Monkey类从 Animal 继承
type Monkey struct {
 Animal 
 Tail string
}

func (m *Monkey) Run() {
 fmt.Printf("猴子用%d只脚跑,尾巴是%s的\n", m.Feet, m.Tail)
}


// Zig类从 Animal 继承
type Zig struct {
 Animal 
 Wing string
}

func (z *Zig) Run() {
 fmt.Printf("蜈蚣用%d只脚跑,翅膀是%s的\n", z.Feet, z.Wing)
}

//多态
type Runner interface { 
 Run() 
}

func RunSomething(r Runner) {
 r.Run()
}

func main() {
 m := &Monkey{Animal{4}, "长长的"}
 RunSomething(m)

 z := &Zig{Animal{8}, "肥肥的"}
 RunSomething(z)
}

// 运行结果
// 猴子用4只脚跑,尾巴是长长的的
// 蜈蚣用8只脚跑,翅膀是肥肥的的