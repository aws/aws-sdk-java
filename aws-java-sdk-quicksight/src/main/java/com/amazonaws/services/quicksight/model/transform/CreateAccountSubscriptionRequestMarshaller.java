/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAccountSubscriptionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAccountSubscriptionRequestMarshaller {

    private static final MarshallingInfo<String> EDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Edition").build();
    private static final MarshallingInfo<String> AUTHENTICATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationMethod").build();
    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> ACCOUNTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountName").build();
    private static final MarshallingInfo<String> NOTIFICATIONEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationEmail").build();
    private static final MarshallingInfo<String> ACTIVEDIRECTORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveDirectoryName").build();
    private static final MarshallingInfo<String> REALM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Realm").build();
    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<List> ADMINGROUP_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AdminGroup").build();
    private static final MarshallingInfo<List> AUTHORGROUP_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthorGroup").build();
    private static final MarshallingInfo<List> READERGROUP_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReaderGroup").build();
    private static final MarshallingInfo<String> FIRSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FirstName").build();
    private static final MarshallingInfo<String> LASTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LastName").build();
    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailAddress").build();
    private static final MarshallingInfo<String> CONTACTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactNumber").build();

    private static final CreateAccountSubscriptionRequestMarshaller instance = new CreateAccountSubscriptionRequestMarshaller();

    public static CreateAccountSubscriptionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAccountSubscriptionRequest createAccountSubscriptionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAccountSubscriptionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getEdition(), EDITION_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getAuthenticationMethod(), AUTHENTICATIONMETHOD_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getAccountName(), ACCOUNTNAME_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getNotificationEmail(), NOTIFICATIONEMAIL_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getActiveDirectoryName(), ACTIVEDIRECTORYNAME_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getRealm(), REALM_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getAdminGroup(), ADMINGROUP_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getAuthorGroup(), AUTHORGROUP_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getReaderGroup(), READERGROUP_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getFirstName(), FIRSTNAME_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getLastName(), LASTNAME_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getEmailAddress(), EMAILADDRESS_BINDING);
            protocolMarshaller.marshall(createAccountSubscriptionRequest.getContactNumber(), CONTACTNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
