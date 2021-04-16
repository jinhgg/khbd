function removal(list) {
  const temObj = {}
  list = list.reduce((cur, next) => {
    temObj[next.value] ? '' : temObj[next.value] = cur.push(next)
    return cur
  }, [])
  return list
}