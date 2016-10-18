/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DescribeConfigRuleEvaluationStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configRuleNames;

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * 
     * @return The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *         names, AWS Config returns status information for all AWS managed Config rules that you use.
     */

    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
            configRuleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configRuleNames;
    }

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * 
     * @param configRuleNames
     *        The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *        names, AWS Config returns status information for all AWS managed Config rules that you use.
     */

    public void setConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
            return;
        }

        this.configRuleNames = new com.amazonaws.internal.SdkInternalList<String>(configRuleNames);
    }

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRuleNames(java.util.Collection)} or {@link #withConfigRuleNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configRuleNames
     *        The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *        names, AWS Config returns status information for all AWS managed Config rules that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRuleEvaluationStatusRequest withConfigRuleNames(String... configRuleNames) {
        if (this.configRuleNames == null) {
            setConfigRuleNames(new com.amazonaws.internal.SdkInternalList<String>(configRuleNames.length));
        }
        for (String ele : configRuleNames) {
            this.configRuleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * 
     * @param configRuleNames
     *        The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *        names, AWS Config returns status information for all AWS managed Config rules that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRuleEvaluationStatusRequest withConfigRuleNames(java.util.Collection<String> configRuleNames) {
        setConfigRuleNames(configRuleNames);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigRuleNames() != null)
            sb.append("ConfigRuleNames: " + getConfigRuleNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigRuleEvaluationStatusRequest == false)
            return false;
        DescribeConfigRuleEvaluationStatusRequest other = (DescribeConfigRuleEvaluationStatusRequest) obj;
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null)
            return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigRuleEvaluationStatusRequest clone() {
        return (DescribeConfigRuleEvaluationStatusRequest) super.clone();
    }
}
