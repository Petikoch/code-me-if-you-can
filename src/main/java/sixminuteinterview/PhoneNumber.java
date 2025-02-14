package sixminuteinterview;

public class PhoneNumber {

    public static final int ZENTRALSCHWEIZ = 6;
    // Swiss regional codes:
    public static final String[] ORTSVORWAHLEN = {
            "071", "043", "044", "031", "033", "034", "041", "052", "055", "061", "062", "081", "091", "021", "022", "026"
    };

    private static final String[] REASONS = {
            "Phone Number Too Long or Too Short",
            "Swiss Number must be valid for its region and length",
            "Unknown Regional Code"
    };

    /**
     * The original value.
     */
    private final String originalValue = null;

    // An index into the ORTSVORWAHLEN array
    private final int ortsvorwahlIndex = ZENTRALSCHWEIZ;
    private final String strippedValue = null;
    private final String invalidReason = null;

    public PhoneNumber(String originalValue) {
        //TODO fertig machen nach den Ferien. Instanzvariablen und Hilfsmethoden sind bereits erstellt.
    }

    /**************************************************************************/
    /* Reduce the string to just numbers */
    private static String stripPhoneNumber(String number) {
        //TODO fertig machen nach den Ferien
        return null;
    }

    /**************************************************************************/
    private static int getOrtsvorwahlCodeIndex(String strippedNumber) {
        //TODO fertig machen nach den Ferien
        return -1; // Unknown regional code
    }

    /**************************************************************************/
    private static String validate(int ortsvorwahlIndex, String strippedNumber) {
        return ortsvorwahlIndex >= 0 ? validateSwissNumber(strippedNumber) : REASONS[2];
    }

    /**************************************************************************/
    /*
     *  Swiss Phone number must be valid for regional codes and length (9-10 digits)
     */
    private static String validateSwissNumber(String strippedNumber) {
        int length = strippedNumber.length();
        return (length >= 9 && length <= 10) ? null : REASONS[1];
    }

    /**************************************************************************/
    public String getValueAsInternational() {
        //TODO fertig machen nach den Ferien
        return null;
    }

    /**************************************************************************/
    public boolean isValid() {
        return (this.invalidReason == null);
    }

    /**************************************************************************/
    public String getInvalidReason() {
        return this.invalidReason;
    }

    /**************************************************************************/
    public String getOriginalText() {
        return originalValue;
    }

    /**************************************************************************/
    public String getStrippedNumber() {
        return this.strippedValue;
    }

    /**************************************************************************/
    /**************************************************************************/
}
