package sixminuteinterview;

public class PhoneNumber {

    public static final int SWITZERLAND = 0;
    public static final String[] NATIONAL_DESTINATION_CODES = {
            "071", "043", "044", "031", "033", "034", "041", "052", "055", "061", "062", "081", "091", "021", "022", "026" // Swiss regional codes
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

    // An index into the COUNTRY_CODES array
    private final int countryCodeIndex = SWITZERLAND;
    private final String strippedValue = null;
    private final String invalidReason = null;

    public PhoneNumber(String originalValue) {
    }

    /**************************************************************************/
    /* Reduce the string to just numbers */
    private static String stripPhoneNumber(String number) {
        return null;
    }

    /**************************************************************************/
    private static int getNationalDestinationCodeIndex(String strippedNumber) {
        return -1; // Unknown regional code
    }

    /**************************************************************************/
    private static String validate(int countryCodeIndex, String strippedNumber) {
        return countryCodeIndex == SWITZERLAND ? validateSwissNumber(strippedNumber) : REASONS[2];
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
        return "+41" + strippedValue.substring(NATIONAL_DESTINATION_CODES[countryCodeIndex].length());
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
