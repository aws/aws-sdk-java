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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The instance metadata options that apply to the HTTP requests that pipeline builds use to launch EC2 build and test
 * instances. For more information about instance metadata options, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-instance-metadata-options.html">Configure the
 * instance metadata options</a> in the <i> <i>Amazon EC2 User Guide</i> </i> for Linux instances, or <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/configuring-instance-metadata-options.html">Configure
 * the instance metadata options</a> in the <i> <i>Amazon EC2 Windows Guide</i> </i> for Windows instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/InstanceMetadataOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceMetadataOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect
     * the response as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>required</b> – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all cases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>optional</b> – You can include a signed token header in your request to retrieve instance metadata, or you can
     * leave it out. If you include it, version 2.0 credentials are returned for the IAM role. Otherwise, version 1.0
     * credentials are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <b>optional</b>.
     * </p>
     */
    private String httpTokens;
    /**
     * <p>
     * Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * </p>
     */
    private Integer httpPutResponseHopLimit;

    /**
     * <p>
     * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect
     * the response as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>required</b> – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all cases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>optional</b> – You can include a signed token header in your request to retrieve instance metadata, or you can
     * leave it out. If you include it, version 2.0 credentials are returned for the IAM role. Otherwise, version 1.0
     * credentials are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <b>optional</b>.
     * </p>
     * 
     * @param httpTokens
     *        Indicates whether a signed token header is required for instance metadata retrieval requests. The values
     *        affect the response as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>required</b> – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all
     *        cases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>optional</b> – You can include a signed token header in your request to retrieve instance metadata, or
     *        you can leave it out. If you include it, version 2.0 credentials are returned for the IAM role. Otherwise,
     *        version 1.0 credentials are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <b>optional</b>.
     */

    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect
     * the response as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>required</b> – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all cases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>optional</b> – You can include a signed token header in your request to retrieve instance metadata, or you can
     * leave it out. If you include it, version 2.0 credentials are returned for the IAM role. Otherwise, version 1.0
     * credentials are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <b>optional</b>.
     * </p>
     * 
     * @return Indicates whether a signed token header is required for instance metadata retrieval requests. The values
     *         affect the response as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>required</b> – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all
     *         cases.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>optional</b> – You can include a signed token header in your request to retrieve instance metadata, or
     *         you can leave it out. If you include it, version 2.0 credentials are returned for the IAM role.
     *         Otherwise, version 1.0 credentials are returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting is <b>optional</b>.
     */

    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * <p>
     * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect
     * the response as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>required</b> – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all cases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>optional</b> – You can include a signed token header in your request to retrieve instance metadata, or you can
     * leave it out. If you include it, version 2.0 credentials are returned for the IAM role. Otherwise, version 1.0
     * credentials are returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <b>optional</b>.
     * </p>
     * 
     * @param httpTokens
     *        Indicates whether a signed token header is required for instance metadata retrieval requests. The values
     *        affect the response as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>required</b> – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all
     *        cases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>optional</b> – You can include a signed token header in your request to retrieve instance metadata, or
     *        you can leave it out. If you include it, version 2.0 credentials are returned for the IAM role. Otherwise,
     *        version 1.0 credentials are returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <b>optional</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMetadataOptions withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
        return this;
    }

    /**
     * <p>
     * Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        Limit the number of hops that an instance metadata request can traverse to reach its destination.
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * </p>
     * 
     * @return Limit the number of hops that an instance metadata request can traverse to reach its destination.
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMetadataOptions withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
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
        if (getHttpTokens() != null)
            sb.append("HttpTokens: ").append(getHttpTokens()).append(",");
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: ").append(getHttpPutResponseHopLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceMetadataOptions == false)
            return false;
        InstanceMetadataOptions other = (InstanceMetadataOptions) obj;
        if (other.getHttpTokens() == null ^ this.getHttpTokens() == null)
            return false;
        if (other.getHttpTokens() != null && other.getHttpTokens().equals(this.getHttpTokens()) == false)
            return false;
        if (other.getHttpPutResponseHopLimit() == null ^ this.getHttpPutResponseHopLimit() == null)
            return false;
        if (other.getHttpPutResponseHopLimit() != null && other.getHttpPutResponseHopLimit().equals(this.getHttpPutResponseHopLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        return hashCode;
    }

    @Override
    public InstanceMetadataOptions clone() {
        try {
            return (InstanceMetadataOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.InstanceMetadataOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
