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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * Lists all the tags for the Amazon RDS Performance Insights resource. This value is an Amazon Resource Name (ARN).
     * For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     */
    private String resourceARN;

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *        value is <code>RDS</code>.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @return List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *         value is <code>RDS</code>.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *        value is <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ListTagsForResourceRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *        value is <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ListTagsForResourceRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * Lists all the tags for the Amazon RDS Performance Insights resource. This value is an Amazon Resource Name (ARN).
     * For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @param resourceARN
     *        Lists all the tags for the Amazon RDS Performance Insights resource. This value is an Amazon Resource Name
     *        (ARN). For information about creating an ARN, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an RDS Amazon Resource Name (ARN)</a>.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Lists all the tags for the Amazon RDS Performance Insights resource. This value is an Amazon Resource Name (ARN).
     * For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @return Lists all the tags for the Amazon RDS Performance Insights resource. This value is an Amazon Resource
     *         Name (ARN). For information about creating an ARN, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an RDS Amazon Resource Name (ARN)</a>.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Lists all the tags for the Amazon RDS Performance Insights resource. This value is an Amazon Resource Name (ARN).
     * For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @param resourceARN
     *        Lists all the tags for the Amazon RDS Performance Insights resource. This value is an Amazon Resource Name
     *        (ARN). For information about creating an ARN, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
