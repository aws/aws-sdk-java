/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutSlotType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSlotTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example,
     * because there is a built-in slot type called <code>AMAZON.DATE</code>, you can't create a custom slot type called
     * <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the slot type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each value
     * can have a list of <code>synonyms</code>, which are additional values that help train the machine learning model
     * about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values
     * for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not
     * using a Lambda function you can choose to return the value that the user entered or the first value in the
     * resolution list as the slot value. The <code>valueSelectionStrategy</code> field indicates the option to use.
     * </p>
     */
    private java.util.List<EnumerationValue> enumerationValues;
    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     * resolution list as the slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * </p>
     */
    private String valueSelectionStrategy;

    private Boolean createVersion;

    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example,
     * because there is a built-in slot type called <code>AMAZON.DATE</code>, you can't create a custom slot type called
     * <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param name
     *        The name of the slot type. The name is <i>not</i> case sensitive. </p>
     *        <p>
     *        The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For
     *        example, because there is a built-in slot type called <code>AMAZON.DATE</code>, you can't create a custom
     *        slot type called <code>DATE</code>.
     *        </p>
     *        <p>
     *        For a list of built-in slot types, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     *        >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example,
     * because there is a built-in slot type called <code>AMAZON.DATE</code>, you can't create a custom slot type called
     * <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @return The name of the slot type. The name is <i>not</i> case sensitive. </p>
     *         <p>
     *         The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For
     *         example, because there is a built-in slot type called <code>AMAZON.DATE</code>, you can't create a custom
     *         slot type called <code>DATE</code>.
     *         </p>
     *         <p>
     *         For a list of built-in slot types, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     *         >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example,
     * because there is a built-in slot type called <code>AMAZON.DATE</code>, you can't create a custom slot type called
     * <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param name
     *        The name of the slot type. The name is <i>not</i> case sensitive. </p>
     *        <p>
     *        The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For
     *        example, because there is a built-in slot type called <code>AMAZON.DATE</code>, you can't create a custom
     *        slot type called <code>DATE</code>.
     *        </p>
     *        <p>
     *        For a list of built-in slot types, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     *        >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @param description
     *        A description of the slot type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @return A description of the slot type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @param description
     *        A description of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each value
     * can have a list of <code>synonyms</code>, which are additional values that help train the machine learning model
     * about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values
     * for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not
     * using a Lambda function you can choose to return the value that the user entered or the first value in the
     * resolution list as the slot value. The <code>valueSelectionStrategy</code> field indicates the option to use.
     * </p>
     * 
     * @return A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each
     *         value can have a list of <code>synonyms</code>, which are additional values that help train the machine
     *         learning model about the values that it resolves for a slot. </p>
     *         <p>
     *         When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible
     *         values for the slot. If you are using a Lambda function, this resolution list is passed to the function.
     *         If you are not using a Lambda function you can choose to return the value that the user entered or the
     *         first value in the resolution list as the slot value. The <code>valueSelectionStrategy</code> field
     *         indicates the option to use.
     */

    public java.util.List<EnumerationValue> getEnumerationValues() {
        return enumerationValues;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each value
     * can have a list of <code>synonyms</code>, which are additional values that help train the machine learning model
     * about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values
     * for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not
     * using a Lambda function you can choose to return the value that the user entered or the first value in the
     * resolution list as the slot value. The <code>valueSelectionStrategy</code> field indicates the option to use.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each
     *        value can have a list of <code>synonyms</code>, which are additional values that help train the machine
     *        learning model about the values that it resolves for a slot. </p>
     *        <p>
     *        When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible
     *        values for the slot. If you are using a Lambda function, this resolution list is passed to the function.
     *        If you are not using a Lambda function you can choose to return the value that the user entered or the
     *        first value in the resolution list as the slot value. The <code>valueSelectionStrategy</code> field
     *        indicates the option to use.
     */

    public void setEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        if (enumerationValues == null) {
            this.enumerationValues = null;
            return;
        }

        this.enumerationValues = new java.util.ArrayList<EnumerationValue>(enumerationValues);
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each value
     * can have a list of <code>synonyms</code>, which are additional values that help train the machine learning model
     * about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values
     * for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not
     * using a Lambda function you can choose to return the value that the user entered or the first value in the
     * resolution list as the slot value. The <code>valueSelectionStrategy</code> field indicates the option to use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnumerationValues(java.util.Collection)} or {@link #withEnumerationValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each
     *        value can have a list of <code>synonyms</code>, which are additional values that help train the machine
     *        learning model about the values that it resolves for a slot. </p>
     *        <p>
     *        When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible
     *        values for the slot. If you are using a Lambda function, this resolution list is passed to the function.
     *        If you are not using a Lambda function you can choose to return the value that the user entered or the
     *        first value in the resolution list as the slot value. The <code>valueSelectionStrategy</code> field
     *        indicates the option to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeRequest withEnumerationValues(EnumerationValue... enumerationValues) {
        if (this.enumerationValues == null) {
            setEnumerationValues(new java.util.ArrayList<EnumerationValue>(enumerationValues.length));
        }
        for (EnumerationValue ele : enumerationValues) {
            this.enumerationValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each value
     * can have a list of <code>synonyms</code>, which are additional values that help train the machine learning model
     * about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values
     * for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not
     * using a Lambda function you can choose to return the value that the user entered or the first value in the
     * resolution list as the slot value. The <code>valueSelectionStrategy</code> field indicates the option to use.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take. Each
     *        value can have a list of <code>synonyms</code>, which are additional values that help train the machine
     *        learning model about the values that it resolves for a slot. </p>
     *        <p>
     *        When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible
     *        values for the slot. If you are using a Lambda function, this resolution list is passed to the function.
     *        If you are not using a Lambda function you can choose to return the value that the user entered or the
     *        first value in the resolution list as the slot value. The <code>valueSelectionStrategy</code> field
     *        indicates the option to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeRequest withEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        setEnumerationValues(enumerationValues);
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new slot type, leave the <code>checksum</code> field blank. If you specify a checksum
     *        you get a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a slot type, set the <code>checksum</code> field to the checksum of the most
     *        recent revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code>
     *        field, or if the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     * 
     * @return Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *         <p>
     *         When you create a new slot type, leave the <code>checksum</code> field blank. If you specify a checksum
     *         you get a <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a slot type, set the <code>checksum</code> field to the checksum of the most
     *         recent revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code>
     *         field, or if the checksum does not match the <code>$LATEST</code> version, you get a
     *         <code>PreconditionFailedException</code> exception.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new slot type, leave the <code>checksum</code> field blank. If you specify a checksum
     *        you get a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a slot type, set the <code>checksum</code> field to the checksum of the most
     *        recent revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code>
     *        field, or if the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeRequest withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     * resolution list as the slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *        set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the
     *        slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     *        resolution list as the slot type value. If there is no resolution list, null is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * @see SlotValueSelectionStrategy
     */

    public void setValueSelectionStrategy(String valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     * resolution list as the slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * </p>
     * 
     * @return Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *         set to one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the
     *         slot value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     *         resolution list as the slot type value. If there is no resolution list, null is returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * @see SlotValueSelectionStrategy
     */

    public String getValueSelectionStrategy() {
        return this.valueSelectionStrategy;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     * resolution list as the slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *        set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the
     *        slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     *        resolution list as the slot type value. If there is no resolution list, null is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueSelectionStrategy
     */

    public PutSlotTypeRequest withValueSelectionStrategy(String valueSelectionStrategy) {
        setValueSelectionStrategy(valueSelectionStrategy);
        return this;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     * resolution list as the slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *        set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if the user value is similar to the
     *        slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot, return the first value in the
     *        resolution list as the slot type value. If there is no resolution list, null is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the <code>valueSelectionStrategy</code>, the default is <code>ORIGINAL_VALUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueSelectionStrategy
     */

    public PutSlotTypeRequest withValueSelectionStrategy(SlotValueSelectionStrategy valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy.toString();
        return this;
    }

    /**
     * @param createVersion
     */

    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * @return
     */

    public Boolean getCreateVersion() {
        return this.createVersion;
    }

    /**
     * @param createVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeRequest withCreateVersion(Boolean createVersion) {
        setCreateVersion(createVersion);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCreateVersion() {
        return this.createVersion;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnumerationValues() != null)
            sb.append("EnumerationValues: ").append(getEnumerationValues()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getValueSelectionStrategy() != null)
            sb.append("ValueSelectionStrategy: ").append(getValueSelectionStrategy()).append(",");
        if (getCreateVersion() != null)
            sb.append("CreateVersion: ").append(getCreateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSlotTypeRequest == false)
            return false;
        PutSlotTypeRequest other = (PutSlotTypeRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnumerationValues() == null ^ this.getEnumerationValues() == null)
            return false;
        if (other.getEnumerationValues() != null && other.getEnumerationValues().equals(this.getEnumerationValues()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getValueSelectionStrategy() == null ^ this.getValueSelectionStrategy() == null)
            return false;
        if (other.getValueSelectionStrategy() != null && other.getValueSelectionStrategy().equals(this.getValueSelectionStrategy()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null && other.getCreateVersion().equals(this.getCreateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnumerationValues() == null) ? 0 : getEnumerationValues().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getValueSelectionStrategy() == null) ? 0 : getValueSelectionStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        return hashCode;
    }

    @Override
    public PutSlotTypeRequest clone() {
        return (PutSlotTypeRequest) super.clone();
    }

}
