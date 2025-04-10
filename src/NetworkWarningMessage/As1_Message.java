package NetworkWarningMessage;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;

    public As1_Message(String message) {
        String trimmed = message.trim();
        String[] splitted = trimmed.split(":");

        machineId = splitted[0].substring(splitted[0].length() - 1, splitted[0].length()).strip();
        machineType = splitted[0].substring(0, splitted[0].length()-1).strip();
        warning = splitted[1].strip();
    }

    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }


    public String toString(){
        return machineType + " " + machineId + " " + warning;
    }

    public boolean ScanWarning(String scanFor){
        if(warning.equals(scanFor)){
            return true;
        }
        if(warning.startsWith(scanFor+" ")){
            return true;
        }
        if(warning.endsWith(" "+scanFor)){
            return true;
        }
        if(warning.contains(" "+scanFor+" ")){
            return true;
        }
        return false;
//        return warning.contains(scanFor);
    }


    public void formatPrint(){
        System.out.println(warning+"___"+machineId+"___"+machineType);
    }
}
