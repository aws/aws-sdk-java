/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutMetricPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetricPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container that you want to add the metric policy to.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The metric policy that you want to associate with the container. In the policy, you must indicate whether you
     * want MediaStore to send container-level metrics. You can also include up to five rules to define groups of
     * objects that you want MediaStore to send object-level metrics for. If you include rules in the policy, construct
     * each rule with both of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An object group that defines which objects to include in the group. The definition can be a path or a file name,
     * but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _ (underscore), = (equal), :
     * (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and * (asterisk). Wildcards (*) are acceptable.
     * </p>
     * </li>
     * <li>
     * <p>
     * An object group name that allows you to refer to the object group. The name can't have more than 30 characters.
     * Valid characters are: a-z, A-Z, 0-9, and _ (underscore).
     * </p>
     * </li>
     * </ul>
     */
    private MetricPolicy metricPolicy;

    /**
     * <p>
     * The name of the container that you want to add the metric policy to.
     * </p>
     * 
     * @param containerName
     *        The name of the container that you want to add the metric policy to.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container that you want to add the metric policy to.
     * </p>
     * 
     * @return The name of the container that you want to add the metric policy to.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container that you want to add the metric policy to.
     * </p>
     * 
     * @param containerName
     *        The name of the container that you want to add the metric policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricPolicyRequest withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The metric policy that you want to associate with the container. In the policy, you must indicate whether you
     * want MediaStore to send container-level metrics. You can also include up to five rules to define groups of
     * objects that you want MediaStore to send object-level metrics for. If you include rules in the policy, construct
     * each rule with both of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An object group that defines which objects to include in the group. The definition can be a path or a file name,
     * but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _ (underscore), = (equal), :
     * (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and * (asterisk). Wildcards (*) are acceptable.
     * </p>
     * </li>
     * <li>
     * <p>
     * An object group name that allows you to refer to the object group. The name can't have more than 30 characters.
     * Valid characters are: a-z, A-Z, 0-9, and _ (underscore).
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricPolicy
     *        The metric policy that you want to associate with the container. In the policy, you must indicate whether
     *        you want MediaStore to send container-level metrics. You can also include up to five rules to define
     *        groups of objects that you want MediaStore to send object-level metrics for. If you include rules in the
     *        policy, construct each rule with both of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An object group that defines which objects to include in the group. The definition can be a path or a file
     *        name, but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _ (underscore), =
     *        (equal), : (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and * (asterisk). Wildcards (*)
     *        are acceptable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An object group name that allows you to refer to the object group. The name can't have more than 30
     *        characters. Valid characters are: a-z, A-Z, 0-9, and _ (underscore).
     *        </p>
     *        </li>
     */

    public void setMetricPolicy(MetricPolicy metricPolicy) {
        this.metricPolicy = metricPolicy;
    }

    /**
     * <p>
     * The metric policy that you want to associate with the container. In the policy, you must indicate whether you
     * want MediaStore to send container-level metrics. You can also include up to five rules to define groups of
     * objects that you want MediaStore to send object-level metrics for. If you include rules in the policy, construct
     * each rule with both of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An object group that defines which objects to include in the group. The definition can be a path or a file name,
     * but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _ (underscore), = (equal), :
     * (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and * (asterisk). Wildcards (*) are acceptable.
     * </p>
     * </li>
     * <li>
     * <p>
     * An object group name that allows you to refer to the object group. The name can't have more than 30 characters.
     * Valid characters are: a-z, A-Z, 0-9, and _ (underscore).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric policy that you want to associate with the container. In the policy, you must indicate whether
     *         you want MediaStore to send container-level metrics. You can also include up to five rules to define
     *         groups of objects that you want MediaStore to send object-level metrics for. If you include rules in the
     *         policy, construct each rule with both of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         An object group that defines which objects to include in the group. The definition can be a path or a
     *         file name, but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _
     *         (underscore), = (equal), : (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and *
     *         (asterisk). Wildcards (*) are acceptable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An object group name that allows you to refer to the object group. The name can't have more than 30
     *         characters. Valid characters are: a-z, A-Z, 0-9, and _ (underscore).
     *         </p>
     *         </li>
     */

    public MetricPolicy getMetricPolicy() {
        return this.metricPolicy;
    }

    /**
     * <p>
     * The metric policy that you want to associate with the container. In the policy, you must indicate whether you
     * want MediaStore to send container-level metrics. You can also include up to five rules to define groups of
     * objects that you want MediaStore to send object-level metrics for. If you include rules in the policy, construct
     * each rule with both of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An object group that defines which objects to include in the group. The definition can be a path or a file name,
     * but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _ (underscore), = (equal), :
     * (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and * (asterisk). Wildcards (*) are acceptable.
     * </p>
     * </li>
     * <li>
     * <p>
     * An object group name that allows you to refer to the object group. The name can't have more than 30 characters.
     * Valid characters are: a-z, A-Z, 0-9, and _ (underscore).
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricPolicy
     *        The metric policy that you want to associate with the container. In the policy, you must indicate whether
     *        you want MediaStore to send container-level metrics. You can also include up to five rules to define
     *        groups of objects that you want MediaStore to send object-level metrics for. If you include rules in the
     *        policy, construct each rule with both of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An object group that defines which objects to include in the group. The definition can be a path or a file
     *        name, but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _ (underscore), =
     *        (equal), : (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and * (asterisk). Wildcards (*)
     *        are acceptable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An object group name that allows you to refer to the object group. The name can't have more than 30
     *        characters. Valid characters are: a-z, A-Z, 0-9, and _ (underscore).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricPolicyRequest withMetricPolicy(MetricPolicy metricPolicy) {
        setMetricPolicy(metricPolicy);
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getMetricPolicy() != null)
            sb.append("MetricPolicy: ").append(getMetricPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricPolicyRequest == false)
            return false;
        PutMetricPolicyRequest other = (PutMetricPolicyRequest) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getMetricPolicy() == null ^ this.getMetricPolicy() == null)
            return false;
        if (other.getMetricPolicy() != null && other.getMetricPolicy().equals(this.getMetricPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getMetricPolicy() == null) ? 0 : getMetricPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutMetricPolicyRequest clone() {
        return (PutMetricPolicyRequest) super.clone();
    }

}
