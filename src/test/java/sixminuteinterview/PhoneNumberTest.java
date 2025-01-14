package sixminuteinterview;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneNumberTest {

    @Test
    public void testValidSwissNumber() {
        PhoneNumber pn = new PhoneNumber("0431234567");
        assertThat(pn.isValid()).isTrue();
        assertThat(pn.getValueAsInternational()).isEqualTo("+41431234567");
    }

    @Test
    public void testInvalidSwissNumberTooShort() {
        PhoneNumber pn = new PhoneNumber("0431234");
        assertThat(pn.isValid()).isFalse();
        assertThat(pn.getInvalidReason()).isEqualTo("Swiss Number must be valid for its region and length");
    }

    @Test
    public void testInvalidSwissNumberTooLong() {
        PhoneNumber pn = new PhoneNumber("043123456789");
        assertThat(pn.isValid()).isFalse();
        assertThat(pn.getInvalidReason()).isEqualTo("Swiss Number must be valid for its region and length");
    }

    @Test
    public void testUnknownRegionalCode() {
        PhoneNumber pn = new PhoneNumber("9991234567");
        assertThat(pn.isValid()).isFalse();
        assertThat(pn.getInvalidReason()).isEqualTo("Unknown Regional Code");
    }

    @Test
    public void testStripPhoneNumber() {
        PhoneNumber pn = new PhoneNumber("(043) 123-4567");
        assertThat(pn.isValid()).isTrue();
        assertThat(pn.getValueAsInternational()).isEqualTo("+41431234567");
    }

    @Test
    public void testOriginalValue() {
        PhoneNumber pn = new PhoneNumber("0431234567");
        assertThat(pn.getOriginalText()).isEqualTo("0431234567");
    }

    @Test
    public void testStrippedValue() {
        PhoneNumber pn = new PhoneNumber("(043) 123-4567");
        assertThat(pn.getStrippedNumber()).isEqualTo("0431234567");
    }

}
