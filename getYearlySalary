public int getYearlySalary (String str) {
    if (str==null) return -1;
    String[] info = str.split(";");
    try {
        return  Integer.parseInt(info[info.length-1].trim())*50;
    } catch (NumberFormatException e) {
        return -1;
    }
}
