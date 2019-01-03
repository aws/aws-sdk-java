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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A friendly name or description of the <a>WebACL</a>. You can't change <code>Name</code> after you create the
     * <code>WebACL</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A friendly name or description for the metrics for this <code>WebACL</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change
     * <code>MetricName</code> after you create the <code>WebACL</code>.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the
     * <code>Rule</code> objects that are associated with the <code>WebACL</code>.
     * </p>
     */
    private WafAction defaultAction;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * A friendly name or description of the <a>WebACL</a>. You can't change <code>Name</code> after you create the
     * <code>WebACL</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>WebACL</a>. You can't change <code>Name</code> after you create
     *        the <code>WebACL</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>WebACL</a>. You can't change <code>Name</code> after you create the
     * <code>WebACL</code>.
     * </p>
     * 
     * @return A friendly name or description of the <a>WebACL</a>. You can't change <code>Name</code> after you create
     *         the <code>WebACL</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>WebACL</a>. You can't change <code>Name</code> after you create the
     * <code>WebACL</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>WebACL</a>. You can't change <code>Name</code> after you create
     *        the <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>WebACL</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change
     * <code>MetricName</code> after you create the <code>WebACL</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>WebACL</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change
     *        <code>MetricName</code> after you create the <code>WebACL</code>.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>WebACL</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change
     * <code>MetricName</code> after you create the <code>WebACL</code>.
     * </p>
     * 
     * @return A friendly name or description for the metrics for this <code>WebACL</code>. The name can contain only
     *         alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change
     *         <code>MetricName</code> after you create the <code>WebACL</code>.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>WebACL</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change
     * <code>MetricName</code> after you create the <code>WebACL</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>WebACL</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change
     *        <code>MetricName</code> after you create the <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the
     * <code>Rule</code> objects that are associated with the <code>WebACL</code>.
     * </p>
     * 
     * @param defaultAction
     *        The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the
     *        <code>Rule</code> objects that are associated with the <code>WebACL</code>.
     */

    public void setDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the
     * <code>Rule</code> objects that are associated with the <code>WebACL</code>.
     * </p>
     * 
     * @return The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of
     *         the <code>Rule</code> objects that are associated with the <code>WebACL</code>.
     */

    public WafAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the
     * <code>Rule</code> objects that are associated with the <code>WebACL</code>.
     * </p>
     * 
     * @param defaultAction
     *        The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the
     *        <code>Rule</code> objects that are associated with the <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLRequest withDefaultAction(WafAction defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @return The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebACLRequest == false)
            return false;
        CreateWebACLRequest other = (CreateWebACLRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebACLRequest clone() {
        return (CreateWebACLRequest) super.clone();
    }

}
