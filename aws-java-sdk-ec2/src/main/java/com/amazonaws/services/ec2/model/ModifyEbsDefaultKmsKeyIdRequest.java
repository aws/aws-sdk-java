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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyEbsDefaultKmsKeyIdRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyEbsDefaultKmsKeyIdRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyEbsDefaultKmsKeyIdRequest> {

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     *        encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *        <p>
     *        You can specify the CMK using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. For example, alias/ExampleAlias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *        valid, the action can appear to complete, but eventually fails.
     *        </p>
     *        <p>
     *        Amazon EBS does not support asymmetric CMKs.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * 
     * @return The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon
     *         EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *         <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *         <p>
     *         You can specify the CMK using any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. For example, alias/ExampleAlias.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *         valid, the action can appear to complete, but eventually fails.
     *         </p>
     *         <p>
     *         Amazon EBS does not support asymmetric CMKs.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     *        encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *        <p>
     *        You can specify the CMK using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. For example, alias/ExampleAlias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *        valid, the action can appear to complete, but eventually fails.
     *        </p>
     *        <p>
     *        Amazon EBS does not support asymmetric CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEbsDefaultKmsKeyIdRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyEbsDefaultKmsKeyIdRequest> getDryRunRequest() {
        Request<ModifyEbsDefaultKmsKeyIdRequest> request = new ModifyEbsDefaultKmsKeyIdRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEbsDefaultKmsKeyIdRequest == false)
            return false;
        ModifyEbsDefaultKmsKeyIdRequest other = (ModifyEbsDefaultKmsKeyIdRequest) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyEbsDefaultKmsKeyIdRequest clone() {
        return (ModifyEbsDefaultKmsKeyIdRequest) super.clone();
    }
}
