package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest {
  protected String createOrderBody() {
    // @formatter:off
    return "{"
      + "\"customer\" : \"ROTH_GARTH\","
      + "\"model\" : \"COMPASS\","
      + "\"trim\" : \"Limited\","
      + "\"doors\" : 4,"
      + "\"color\" : \"EXT_REDLINE\","
      + "\"engine\" : \"2_0_HYBRID\","
      + "\"tire\" : \"35_TOYO\","
      + "\"options\" : ["
      +             "\"EXT_WARN_WINCH\","
      +             "\"EXT_AEV_LIFT\""
      +             "]"
      + "}\""
      + "";
    // @formatter:on
  };   
  
}
