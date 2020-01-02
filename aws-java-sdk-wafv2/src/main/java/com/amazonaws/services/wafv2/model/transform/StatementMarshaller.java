/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StatementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StatementMarshaller {

    private static final MarshallingInfo<StructuredPojo> BYTEMATCHSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ByteMatchStatement").build();
    private static final MarshallingInfo<StructuredPojo> SQLIMATCHSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqliMatchStatement").build();
    private static final MarshallingInfo<StructuredPojo> XSSMATCHSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XssMatchStatement").build();
    private static final MarshallingInfo<StructuredPojo> SIZECONSTRAINTSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeConstraintStatement").build();
    private static final MarshallingInfo<StructuredPojo> GEOMATCHSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeoMatchStatement").build();
    private static final MarshallingInfo<StructuredPojo> RULEGROUPREFERENCESTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupReferenceStatement").build();
    private static final MarshallingInfo<StructuredPojo> IPSETREFERENCESTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IPSetReferenceStatement").build();
    private static final MarshallingInfo<StructuredPojo> REGEXPATTERNSETREFERENCESTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegexPatternSetReferenceStatement").build();
    private static final MarshallingInfo<StructuredPojo> RATEBASEDSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RateBasedStatement").build();
    private static final MarshallingInfo<StructuredPojo> ANDSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AndStatement").build();
    private static final MarshallingInfo<StructuredPojo> ORSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrStatement").build();
    private static final MarshallingInfo<StructuredPojo> NOTSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotStatement").build();
    private static final MarshallingInfo<StructuredPojo> MANAGEDRULEGROUPSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedRuleGroupStatement").build();

    private static final StatementMarshaller instance = new StatementMarshaller();

    public static StatementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Statement statement, ProtocolMarshaller protocolMarshaller) {

        if (statement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(statement.getByteMatchStatement(), BYTEMATCHSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getSqliMatchStatement(), SQLIMATCHSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getXssMatchStatement(), XSSMATCHSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getSizeConstraintStatement(), SIZECONSTRAINTSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getGeoMatchStatement(), GEOMATCHSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getRuleGroupReferenceStatement(), RULEGROUPREFERENCESTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getIPSetReferenceStatement(), IPSETREFERENCESTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getRegexPatternSetReferenceStatement(), REGEXPATTERNSETREFERENCESTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getRateBasedStatement(), RATEBASEDSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getAndStatement(), ANDSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getOrStatement(), ORSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getNotStatement(), NOTSTATEMENT_BINDING);
            protocolMarshaller.marshall(statement.getManagedRuleGroupStatement(), MANAGEDRULEGROUPSTATEMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
