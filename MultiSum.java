class Arithmetic {
    public Integer sum(Integer[] ints) {
        int total = 0;
        for (int num : ints) total += num;
        return total;
    }
    
    public String sum(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) sb.append(s);
        return sb.toString();
    }
}