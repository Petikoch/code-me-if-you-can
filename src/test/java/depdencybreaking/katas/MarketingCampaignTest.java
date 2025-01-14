package depdencybreaking.katas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarketingCampaignTest {
    @Test
    public void test2() {
        MarketingCampaign testee = new MarketingCampaign();

        boolean actual = testee.isCrazySalesDay();

        assertThat(actual).isFalse();
    }
}