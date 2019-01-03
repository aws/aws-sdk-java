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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListLoggingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLoggingConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     */
    private java.util.List<LoggingConfiguration> loggingConfigurations;
    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another <code>ListLoggingConfigurations</code> request, and specify
     * the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @return An array of <a>LoggingConfiguration</a> objects.
     */

    public java.util.List<LoggingConfiguration> getLoggingConfigurations() {
        return loggingConfigurations;
    }

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param loggingConfigurations
     *        An array of <a>LoggingConfiguration</a> objects.
     */

    public void setLoggingConfigurations(java.util.Collection<LoggingConfiguration> loggingConfigurations) {
        if (loggingConfigurations == null) {
            this.loggingConfigurations = null;
            return;
        }

        this.loggingConfigurations = new java.util.ArrayList<LoggingConfiguration>(loggingConfigurations);
    }

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoggingConfigurations(java.util.Collection)} or
     * {@link #withLoggingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param loggingConfigurations
     *        An array of <a>LoggingConfiguration</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoggingConfigurationsResult withLoggingConfigurations(LoggingConfiguration... loggingConfigurations) {
        if (this.loggingConfigurations == null) {
            setLoggingConfigurations(new java.util.ArrayList<LoggingConfiguration>(loggingConfigurations.length));
        }
        for (LoggingConfiguration ele : loggingConfigurations) {
            this.loggingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param loggingConfigurations
     *        An array of <a>LoggingConfiguration</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoggingConfigurationsResult withLoggingConfigurations(java.util.Collection<LoggingConfiguration> loggingConfigurations) {
        setLoggingConfigurations(loggingConfigurations);
        return this;
    }

    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another <code>ListLoggingConfigurations</code> request, and specify
     * the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>LoggingConfigurations</code> than the number that you specified for
     *        <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>LoggingConfigurations</code>, submit another <code>ListLoggingConfigurations</code> request, and
     *        specify the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the
     *        next request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another <code>ListLoggingConfigurations</code> request, and specify
     * the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @return If you have more <code>LoggingConfigurations</code> than the number that you specified for
     *         <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *         <code>LoggingConfigurations</code>, submit another <code>ListLoggingConfigurations</code> request, and
     *         specify the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the
     *         next request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another <code>ListLoggingConfigurations</code> request, and specify
     * the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>LoggingConfigurations</code> than the number that you specified for
     *        <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>LoggingConfigurations</code>, submit another <code>ListLoggingConfigurations</code> request, and
     *        specify the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoggingConfigurationsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getLoggingConfigurations() != null)
            sb.append("LoggingConfigurations: ").append(getLoggingConfigurations()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLoggingConfigurationsResult == false)
            return false;
        ListLoggingConfigurationsResult other = (ListLoggingConfigurationsResult) obj;
        if (other.getLoggingConfigurations() == null ^ this.getLoggingConfigurations() == null)
            return false;
        if (other.getLoggingConfigurations() != null && other.getLoggingConfigurations().equals(this.getLoggingConfigurations()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggingConfigurations() == null) ? 0 : getLoggingConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListLoggingConfigurationsResult clone() {
        try {
            return (ListLoggingConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
