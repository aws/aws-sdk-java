/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/EntityDetectorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityDetectorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Entity types to detect. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USA_SSN
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_ITIN
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_PASSPORT_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * PHONE_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DRIVING_LICENSE
     * </p>
     * </li>
     * <li>
     * <p>
     * BANK_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * CREDIT_CARD
     * </p>
     * </li>
     * <li>
     * <p>
     * IP_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * MAC_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DEA_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HCPCS_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_PROVIDER_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_DRUG_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_CPT_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * PERSON_NAME
     * </p>
     * </li>
     * <li>
     * <p>
     * DATE
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Entity type group USA_ALL is also supported, and includes all of the above entity types except PERSON_NAME
     * and DATE.
     * </p>
     */
    private java.util.List<String> entityTypes;
    /**
     * <p>
     * Configuration of statistics that are allowed to be run on columns that contain detected entities. When undefined,
     * no statistics will be computed on columns that contain detected entities.
     * </p>
     */
    private java.util.List<AllowedStatistics> allowedStatistics;

    /**
     * <p>
     * Entity types to detect. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USA_SSN
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_ITIN
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_PASSPORT_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * PHONE_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DRIVING_LICENSE
     * </p>
     * </li>
     * <li>
     * <p>
     * BANK_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * CREDIT_CARD
     * </p>
     * </li>
     * <li>
     * <p>
     * IP_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * MAC_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DEA_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HCPCS_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_PROVIDER_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_DRUG_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_CPT_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * PERSON_NAME
     * </p>
     * </li>
     * <li>
     * <p>
     * DATE
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Entity type group USA_ALL is also supported, and includes all of the above entity types except PERSON_NAME
     * and DATE.
     * </p>
     * 
     * @return Entity types to detect. Can be any of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         USA_SSN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_ITIN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_PASSPORT_NUMBER
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PHONE_NUMBER
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_DRIVING_LICENSE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BANK_ACCOUNT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREDIT_CARD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP_ADDRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAC_ADDRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_DEA_NUMBER
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_HCPCS_CODE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_NATIONAL_PROVIDER_IDENTIFIER
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_NATIONAL_DRUG_CODE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_HEALTH_INSURANCE_CLAIM_NUMBER
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_MEDICARE_BENEFICIARY_IDENTIFIER
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USA_CPT_CODE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PERSON_NAME
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DATE
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The Entity type group USA_ALL is also supported, and includes all of the above entity types except
     *         PERSON_NAME and DATE.
     */

    public java.util.List<String> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * Entity types to detect. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USA_SSN
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_ITIN
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_PASSPORT_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * PHONE_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DRIVING_LICENSE
     * </p>
     * </li>
     * <li>
     * <p>
     * BANK_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * CREDIT_CARD
     * </p>
     * </li>
     * <li>
     * <p>
     * IP_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * MAC_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DEA_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HCPCS_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_PROVIDER_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_DRUG_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_CPT_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * PERSON_NAME
     * </p>
     * </li>
     * <li>
     * <p>
     * DATE
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Entity type group USA_ALL is also supported, and includes all of the above entity types except PERSON_NAME
     * and DATE.
     * </p>
     * 
     * @param entityTypes
     *        Entity types to detect. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        USA_SSN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_ITIN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_PASSPORT_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PHONE_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_DRIVING_LICENSE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BANK_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREDIT_CARD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP_ADDRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MAC_ADDRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_DEA_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_HCPCS_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_NATIONAL_PROVIDER_IDENTIFIER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_NATIONAL_DRUG_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_HEALTH_INSURANCE_CLAIM_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_MEDICARE_BENEFICIARY_IDENTIFIER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_CPT_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PERSON_NAME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DATE
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The Entity type group USA_ALL is also supported, and includes all of the above entity types except
     *        PERSON_NAME and DATE.
     */

    public void setEntityTypes(java.util.Collection<String> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<String>(entityTypes);
    }

    /**
     * <p>
     * Entity types to detect. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USA_SSN
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_ITIN
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_PASSPORT_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * PHONE_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DRIVING_LICENSE
     * </p>
     * </li>
     * <li>
     * <p>
     * BANK_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * CREDIT_CARD
     * </p>
     * </li>
     * <li>
     * <p>
     * IP_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * MAC_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DEA_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HCPCS_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_PROVIDER_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_DRUG_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_CPT_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * PERSON_NAME
     * </p>
     * </li>
     * <li>
     * <p>
     * DATE
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Entity type group USA_ALL is also supported, and includes all of the above entity types except PERSON_NAME
     * and DATE.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        Entity types to detect. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        USA_SSN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_ITIN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_PASSPORT_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PHONE_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_DRIVING_LICENSE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BANK_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREDIT_CARD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP_ADDRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MAC_ADDRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_DEA_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_HCPCS_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_NATIONAL_PROVIDER_IDENTIFIER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_NATIONAL_DRUG_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_HEALTH_INSURANCE_CLAIM_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_MEDICARE_BENEFICIARY_IDENTIFIER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_CPT_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PERSON_NAME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DATE
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The Entity type group USA_ALL is also supported, and includes all of the above entity types except
     *        PERSON_NAME and DATE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetectorConfiguration withEntityTypes(String... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<String>(entityTypes.length));
        }
        for (String ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Entity types to detect. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USA_SSN
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_ITIN
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_PASSPORT_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * PHONE_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DRIVING_LICENSE
     * </p>
     * </li>
     * <li>
     * <p>
     * BANK_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * CREDIT_CARD
     * </p>
     * </li>
     * <li>
     * <p>
     * IP_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * MAC_ADDRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_DEA_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HCPCS_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_PROVIDER_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_NATIONAL_DRUG_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER
     * </p>
     * </li>
     * <li>
     * <p>
     * USA_CPT_CODE
     * </p>
     * </li>
     * <li>
     * <p>
     * PERSON_NAME
     * </p>
     * </li>
     * <li>
     * <p>
     * DATE
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Entity type group USA_ALL is also supported, and includes all of the above entity types except PERSON_NAME
     * and DATE.
     * </p>
     * 
     * @param entityTypes
     *        Entity types to detect. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        USA_SSN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_ITIN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_PASSPORT_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PHONE_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_DRIVING_LICENSE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BANK_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREDIT_CARD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP_ADDRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MAC_ADDRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_DEA_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_HCPCS_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_NATIONAL_PROVIDER_IDENTIFIER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_NATIONAL_DRUG_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_HEALTH_INSURANCE_CLAIM_NUMBER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_MEDICARE_BENEFICIARY_IDENTIFIER
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USA_CPT_CODE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PERSON_NAME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DATE
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The Entity type group USA_ALL is also supported, and includes all of the above entity types except
     *        PERSON_NAME and DATE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetectorConfiguration withEntityTypes(java.util.Collection<String> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * Configuration of statistics that are allowed to be run on columns that contain detected entities. When undefined,
     * no statistics will be computed on columns that contain detected entities.
     * </p>
     * 
     * @return Configuration of statistics that are allowed to be run on columns that contain detected entities. When
     *         undefined, no statistics will be computed on columns that contain detected entities.
     */

    public java.util.List<AllowedStatistics> getAllowedStatistics() {
        return allowedStatistics;
    }

    /**
     * <p>
     * Configuration of statistics that are allowed to be run on columns that contain detected entities. When undefined,
     * no statistics will be computed on columns that contain detected entities.
     * </p>
     * 
     * @param allowedStatistics
     *        Configuration of statistics that are allowed to be run on columns that contain detected entities. When
     *        undefined, no statistics will be computed on columns that contain detected entities.
     */

    public void setAllowedStatistics(java.util.Collection<AllowedStatistics> allowedStatistics) {
        if (allowedStatistics == null) {
            this.allowedStatistics = null;
            return;
        }

        this.allowedStatistics = new java.util.ArrayList<AllowedStatistics>(allowedStatistics);
    }

    /**
     * <p>
     * Configuration of statistics that are allowed to be run on columns that contain detected entities. When undefined,
     * no statistics will be computed on columns that contain detected entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedStatistics(java.util.Collection)} or {@link #withAllowedStatistics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedStatistics
     *        Configuration of statistics that are allowed to be run on columns that contain detected entities. When
     *        undefined, no statistics will be computed on columns that contain detected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetectorConfiguration withAllowedStatistics(AllowedStatistics... allowedStatistics) {
        if (this.allowedStatistics == null) {
            setAllowedStatistics(new java.util.ArrayList<AllowedStatistics>(allowedStatistics.length));
        }
        for (AllowedStatistics ele : allowedStatistics) {
            this.allowedStatistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration of statistics that are allowed to be run on columns that contain detected entities. When undefined,
     * no statistics will be computed on columns that contain detected entities.
     * </p>
     * 
     * @param allowedStatistics
     *        Configuration of statistics that are allowed to be run on columns that contain detected entities. When
     *        undefined, no statistics will be computed on columns that contain detected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetectorConfiguration withAllowedStatistics(java.util.Collection<AllowedStatistics> allowedStatistics) {
        setAllowedStatistics(allowedStatistics);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEntityTypes() != null)
            sb.append("EntityTypes: ").append(getEntityTypes()).append(",");
        if (getAllowedStatistics() != null)
            sb.append("AllowedStatistics: ").append(getAllowedStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityDetectorConfiguration == false)
            return false;
        EntityDetectorConfiguration other = (EntityDetectorConfiguration) obj;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getAllowedStatistics() == null ^ this.getAllowedStatistics() == null)
            return false;
        if (other.getAllowedStatistics() != null && other.getAllowedStatistics().equals(this.getAllowedStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getAllowedStatistics() == null) ? 0 : getAllowedStatistics().hashCode());
        return hashCode;
    }

    @Override
    public EntityDetectorConfiguration clone() {
        try {
            return (EntityDetectorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.EntityDetectorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
