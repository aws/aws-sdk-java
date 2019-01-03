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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of the metric after you
     * create the <code>Rule</code>.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after
     *        you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     * 
     * @return A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after
     *         you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after
     *        you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of the metric after you
     * create the <code>Rule</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>Rule</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of
     *        the metric after you create the <code>Rule</code>.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of the metric after you
     * create the <code>Rule</code>.
     * </p>
     * 
     * @return A friendly name or description for the metrics for this <code>Rule</code>. The name can contain only
     *         alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of
     *         the metric after you create the <code>Rule</code>.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of the metric after you
     * create the <code>Rule</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>Rule</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of
     *        the metric after you create the <code>Rule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withMetricName(String metricName) {
        setMetricName(metricName);
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

    public CreateRuleRequest withChangeToken(String changeToken) {
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

        if (obj instanceof CreateRuleRequest == false)
            return false;
        CreateRuleRequest other = (CreateRuleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
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
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleRequest clone() {
        return (CreateRuleRequest) super.clone();
    }

}
