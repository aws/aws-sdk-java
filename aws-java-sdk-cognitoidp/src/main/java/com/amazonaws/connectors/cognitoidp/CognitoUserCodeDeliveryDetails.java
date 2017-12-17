/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.math.pro.ak.util.cognito;

import com.amazonaws.services.cognitoidp.model.CodeDeliveryDetailsType;
import com.amazonaws.services.cognitoidp.model.MFAOptionType;

/**
 * This class encapsulates all the information that represent where and in what form a verification
 * code will be delivered.
 */
public class CognitoUserCodeDeliveryDetails {
    /**
     * This will contain the masked information indicating where the code will be delivered. i.e. which email/phone number
     */

    private final String destination;

    /**
     * This indicated how the code will be delivered. i.e. email/sms/voice call etc
     */
    private final String deliveryMedium;

    /**
     * This is will represent what mode - Email/Phone number
     */
    private final String attributeName;

    /**
     * Constructs this object with CodeDeliveryDetailsType.
     *
     * @param codeDeliveryDetails       REQUIRED: Cognito code delivery details.
     */
    protected CognitoUserCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        if (codeDeliveryDetails != null) {
            destination = codeDeliveryDetails.getDestination();
            deliveryMedium = codeDeliveryDetails.getDeliveryMedium();
            attributeName = codeDeliveryDetails.getAttributeName();
        } else {
            destination = null;
            deliveryMedium = null;
            attributeName = null;
        }
    }

    // Constructs this object with MFAOptionType
    protected CognitoUserCodeDeliveryDetails(MFAOptionType mfaOptionType) {
        if (mfaOptionType != null) {
            destination = null;
            deliveryMedium = mfaOptionType.getDeliveryMedium();
            attributeName = mfaOptionType.getAttributeName();
        } else {
            destination = null;
            deliveryMedium = null;
            attributeName = null;
        }
    }

    /**
     * Constructs this object with code delivery details individually specified.
     *
     * @param destination           REQUIRED: Destination.
     * @param deliveryMedium        REQUIRED: Medium.
     * @param attributeName         REQUIRED: Mode.
     */
    public CognitoUserCodeDeliveryDetails(String destination, String deliveryMedium, String attributeName) {
        this.destination = destination;
        this.deliveryMedium = deliveryMedium;
        this.attributeName = attributeName;
    }

    /**
     * Returns the destination for code delivery.
     *
     * @return code delivery destination.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Returns the delivery medium for code delivery.
     *
     * @return code delivery medium.
     */
    public String getDeliveryMedium() {
        return deliveryMedium;
    }

    /**
     * Returns how will the code be delivered.
     *
     * @return code delivery mode.
     */
    public String getAttributeName() {
        return attributeName;
    }
}
