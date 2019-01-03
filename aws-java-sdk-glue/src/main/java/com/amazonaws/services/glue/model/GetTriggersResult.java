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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTriggers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTriggersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     */
    private java.util.List<Trigger> triggers;
    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     * 
     * @return A list of triggers for the specified job.
     */

    public java.util.List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     * 
     * @param triggers
     *        A list of triggers for the specified job.
     */

    public void setTriggers(java.util.Collection<Trigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<Trigger>(triggers);
    }

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        A list of triggers for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTriggersResult withTriggers(Trigger... triggers) {
        if (this.triggers == null) {
            setTriggers(new java.util.ArrayList<Trigger>(triggers.length));
        }
        for (Trigger ele : triggers) {
            this.triggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     * 
     * @param triggers
     *        A list of triggers for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTriggersResult withTriggers(java.util.Collection<Trigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all the requested triggers have yet been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been returned.
     * </p>
     * 
     * @return A continuation token, if not all the requested triggers have yet been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all the requested triggers have yet been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTriggersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTriggersResult == false)
            return false;
        GetTriggersResult other = (GetTriggersResult) obj;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTriggersResult clone() {
        try {
            return (GetTriggersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
