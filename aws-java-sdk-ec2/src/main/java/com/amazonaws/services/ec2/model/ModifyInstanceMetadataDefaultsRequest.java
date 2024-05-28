/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyInstanceMetadataDefaultsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceMetadataDefaultsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstanceMetadataDefaultsRequest> {

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     */
    private String httpTokens;
    /**
     * <p>
     * The maximum number of hops that the metadata token can travel. To indicate no preference, specify <code>-1</code>
     * .
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>, and <code>-1</code> to indicate no preference
     * </p>
     */
    private Integer httpPutResponseHopLimit;
    /**
     * <p>
     * Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be accessed.
     * </p>
     */
    private String httpEndpoint;
    /**
     * <p>
     * Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private String instanceMetadataTags;

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpTokens
     *        Indicates whether IMDSv2 is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *        </p>
     *        </li>
     * @see MetadataDefaultHttpTokensState
     */

    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether IMDSv2 is required.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *         </p>
     *         </li>
     * @see MetadataDefaultHttpTokensState
     */

    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpTokens
     *        Indicates whether IMDSv2 is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataDefaultHttpTokensState
     */

    public ModifyInstanceMetadataDefaultsRequest withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
        return this;
    }

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpTokens
     *        Indicates whether IMDSv2 is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>optional</code> – IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>required</code> – IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataDefaultHttpTokensState
     */

    public ModifyInstanceMetadataDefaultsRequest withHttpTokens(MetadataDefaultHttpTokensState httpTokens) {
        this.httpTokens = httpTokens.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of hops that the metadata token can travel. To indicate no preference, specify <code>-1</code>
     * .
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>, and <code>-1</code> to indicate no preference
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The maximum number of hops that the metadata token can travel. To indicate no preference, specify
     *        <code>-1</code>.</p>
     *        <p>
     *        Possible values: Integers from <code>1</code> to <code>64</code>, and <code>-1</code> to indicate no
     *        preference
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The maximum number of hops that the metadata token can travel. To indicate no preference, specify <code>-1</code>
     * .
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>, and <code>-1</code> to indicate no preference
     * </p>
     * 
     * @return The maximum number of hops that the metadata token can travel. To indicate no preference, specify
     *         <code>-1</code>.</p>
     *         <p>
     *         Possible values: Integers from <code>1</code> to <code>64</code>, and <code>-1</code> to indicate no
     *         preference
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The maximum number of hops that the metadata token can travel. To indicate no preference, specify <code>-1</code>
     * .
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>, and <code>-1</code> to indicate no preference
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The maximum number of hops that the metadata token can travel. To indicate no preference, specify
     *        <code>-1</code>.</p>
     *        <p>
     *        Possible values: Integers from <code>1</code> to <code>64</code>, and <code>-1</code> to indicate no
     *        preference
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceMetadataDefaultsRequest withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
        return this;
    }

    /**
     * <p>
     * Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be accessed.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be
     *        accessed.
     * @see DefaultInstanceMetadataEndpointState
     */

    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be accessed.
     * </p>
     * 
     * @return Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be
     *         accessed.
     * @see DefaultInstanceMetadataEndpointState
     */

    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be accessed.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be
     *        accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultInstanceMetadataEndpointState
     */

    public ModifyInstanceMetadataDefaultsRequest withHttpEndpoint(String httpEndpoint) {
        setHttpEndpoint(httpEndpoint);
        return this;
    }

    /**
     * <p>
     * Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be accessed.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the IMDS endpoint on an instance. When disabled, the instance metadata can't be
     *        accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultInstanceMetadataEndpointState
     */

    public ModifyInstanceMetadataDefaultsRequest withHttpEndpoint(DefaultInstanceMetadataEndpointState httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
        return this;
    }

    /**
     * <p>
     * Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * @see DefaultInstanceMetadataTagsState
     */

    public void setInstanceMetadataTags(String instanceMetadataTags) {
        this.instanceMetadataTags = instanceMetadataTags;
    }

    /**
     * <p>
     * Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *         with instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * @see DefaultInstanceMetadataTagsState
     */

    public String getInstanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    /**
     * <p>
     * Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultInstanceMetadataTagsState
     */

    public ModifyInstanceMetadataDefaultsRequest withInstanceMetadataTags(String instanceMetadataTags) {
        setInstanceMetadataTags(instanceMetadataTags);
        return this;
    }

    /**
     * <p>
     * Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Enables or disables access to an instance's tags from the instance metadata. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultInstanceMetadataTagsState
     */

    public ModifyInstanceMetadataDefaultsRequest withInstanceMetadataTags(DefaultInstanceMetadataTagsState instanceMetadataTags) {
        this.instanceMetadataTags = instanceMetadataTags.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyInstanceMetadataDefaultsRequest> getDryRunRequest() {
        Request<ModifyInstanceMetadataDefaultsRequest> request = new ModifyInstanceMetadataDefaultsRequestMarshaller().marshall(this);
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
        if (getHttpTokens() != null)
            sb.append("HttpTokens: ").append(getHttpTokens()).append(",");
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: ").append(getHttpPutResponseHopLimit()).append(",");
        if (getHttpEndpoint() != null)
            sb.append("HttpEndpoint: ").append(getHttpEndpoint()).append(",");
        if (getInstanceMetadataTags() != null)
            sb.append("InstanceMetadataTags: ").append(getInstanceMetadataTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceMetadataDefaultsRequest == false)
            return false;
        ModifyInstanceMetadataDefaultsRequest other = (ModifyInstanceMetadataDefaultsRequest) obj;
        if (other.getHttpTokens() == null ^ this.getHttpTokens() == null)
            return false;
        if (other.getHttpTokens() != null && other.getHttpTokens().equals(this.getHttpTokens()) == false)
            return false;
        if (other.getHttpPutResponseHopLimit() == null ^ this.getHttpPutResponseHopLimit() == null)
            return false;
        if (other.getHttpPutResponseHopLimit() != null && other.getHttpPutResponseHopLimit().equals(this.getHttpPutResponseHopLimit()) == false)
            return false;
        if (other.getHttpEndpoint() == null ^ this.getHttpEndpoint() == null)
            return false;
        if (other.getHttpEndpoint() != null && other.getHttpEndpoint().equals(this.getHttpEndpoint()) == false)
            return false;
        if (other.getInstanceMetadataTags() == null ^ this.getInstanceMetadataTags() == null)
            return false;
        if (other.getInstanceMetadataTags() != null && other.getInstanceMetadataTags().equals(this.getInstanceMetadataTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getInstanceMetadataTags() == null) ? 0 : getInstanceMetadataTags().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceMetadataDefaultsRequest clone() {
        return (ModifyInstanceMetadataDefaultsRequest) super.clone();
    }
}
