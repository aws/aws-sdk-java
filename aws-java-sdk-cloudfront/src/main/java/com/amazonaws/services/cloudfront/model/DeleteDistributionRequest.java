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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following
 * steps.
 * </p>
 * <p>
 * <b>To delete a web distribution using the CloudFront API:</b>
 * </p>
 * <ol>
 * <li>
 * <p>
 * Disable the web distribution
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit a <code>GET Distribution Config</code> request to get the current configuration and the <code>Etag</code>
 * header for the distribution.
 * </p>
 * </li>
 * <li>
 * <p>
 * Update the XML document that was returned in the response to your <code>GET Distribution Config</code> request to
 * change the value of <code>Enabled</code> to <code>false</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution. In the
 * request body, include the XML document that you updated in Step 3. Set the value of the HTTP <code>If-Match</code>
 * header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
 * <code>GET Distribution Config</code> request in Step 2.
 * </p>
 * </li>
 * <li>
 * <p>
 * Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution was
 * successfully disabled.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When propagation is
 * complete, the value of <code>Status</code> is <code>Deployed</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header to the
 * value of the <code>ETag</code> header that CloudFront returned when you submitted the
 * <code>GET Distribution Config</code> request in Step 6.
 * </p>
 * </li>
 * <li>
 * <p>
 * Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was
 * successfully deleted.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For information about deleting a distribution using the CloudFront console, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
 * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeleteDistribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDistributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you disabled the distribution. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * Default constructor for DeleteDistributionRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteDistributionRequest() {
    }

    /**
     * Constructs a new DeleteDistributionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param id
     *        The distribution ID.
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when you disabled the distribution. For
     *        example: <code>E2QWRUHAPOMQZL</code>.
     */
    public DeleteDistributionRequest(String id, String ifMatch) {
        setId(id);
        setIfMatch(ifMatch);
    }

    /**
     * <p>
     * The distribution ID.
     * </p>
     * 
     * @param id
     *        The distribution ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The distribution ID.
     * </p>
     * 
     * @return The distribution ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The distribution ID.
     * </p>
     * 
     * @param id
     *        The distribution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDistributionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you disabled the distribution. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when you disabled the distribution. For
     *        example: <code>E2QWRUHAPOMQZL</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you disabled the distribution. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The value of the <code>ETag</code> header that you received when you disabled the distribution. For
     *         example: <code>E2QWRUHAPOMQZL</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you disabled the distribution. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when you disabled the distribution. For
     *        example: <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDistributionRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDistributionRequest == false)
            return false;
        DeleteDistributionRequest other = (DeleteDistributionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDistributionRequest clone() {
        return (DeleteDistributionRequest) super.clone();
    }

}
