package com.gdr.aws.kms;

// Use the endpoint that corresponds to your region. This example uses the US West (California)
// region. For more information, see http://amzn.to/1mKTMmG (docs.aws.amazon.com)

public enum KmsRegionEndPoint {

    us_east_1("US East (N. Virginia)", "https://kms.us-east-1.amazonaws.com"),
    us_west_1("US West (N. California)", "https://kms.us-west-1.amazonaws.com"),
    us_west_2("US West (Oregon)", "https://kms.us-west-2.amazonaws.com"),
    ap_south_1("Asia Pacific (Mumbai)", "https://kms.ap-south-1.amazonaws.com"),
    ap_northeast_2("Asia Pacific (Seoul)", "https://kms.ap-northeast-2.amazonaws.com"),
    ap_southeast_1("Asia Pacific (Singapore)", "https://kms.ap-southeast-1.amazonaws.com"),
    ap_southeast_2("Asia Pacific (Sydney)", "https://kms.ap-southeast-2.amazonaws.com"),
    ap_northeast_1("Asia Pacific (Tokyo)", "https://kms.ap-northeast-1.amazonaws.com"),
    eu_central_1("EU (Frankfurt)", "https://kms.eu-central-1.amazonaws.com"),
    eu_west_1("EU (Ireland)", "https://kms.eu-west-1.amazonaws.com"),
    sa_east_1("South America (São Paulo)", "https://kms.sa-east-1.amazonaws.com");


    private final String description;
    private final String url;

    KmsRegionEndPoint(String description, String url) {
        this.description = description;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
}