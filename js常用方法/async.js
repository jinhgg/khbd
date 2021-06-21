const f1 = async () => {
    return new Promise ((resolve, reject) => {
        setTimeout(()=>{
            resolve('i am f1')
        }, 5000)
    })
}

const f2 = async () => {
    return new Promise ((resolve, reject) => {
        setTimeout(()=>{
            resolve('i am f2')
        }, 4000)
    })
}

const f3 = async () => {
    return new Promise ((resolve, reject) => {
        setTimeout(()=>{
            resolve('i am f2')
        }, 3000)
    })
}

const main = async () => {
    // 三个函数完全串行, f1执行完才执行f2执行完才执行f3
    // 总耗时12秒
    console.log(await f1()) // 5s
    console.log(await f2()) // 4s
    console.log(await f3()) // 3s
}
main()

// async函数必须用await接收 ,否则拿不到返回值
