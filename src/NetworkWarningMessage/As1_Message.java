package NetworkWarningMessage;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;

    public As1_Message(String message) {
        String trimmed = message.trim();
        String[] splitted = trimmed.split(":");

        machineId = splitted[0].substring(splitted[0].length() - 1, splitted[0].length());
        machineType = splitted[0].substring(0, splitted[0].length()-1);
        warning = splitted[1];
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
}
