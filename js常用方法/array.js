const arr = [1, 2, 3, 4]
// 1.判断arr是否包含某个元素
arr.includes(1)
// 2.按条件过滤
arr = [{ a: 11, b: 22, c: 33 }, { a: 11, b: 22, c: 33 }, { a: 22, b: 22, c: 33 }]
new_arr = arr.filter(item => item.a !== 22) // 去除a为22的元素
