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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you
 * to publish email sending events. For information about using configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListConfigurationSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token returned from a previous call to <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * A token returned from a previous call to <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListConfigurationSets</code> to indicate the position of
     *        the configuration set in the configuration set list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     * 
     * @return A token returned from a previous call to <code>ListConfigurationSets</code> to indicate the position of
     *         the configuration set in the configuration set list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListConfigurationSets</code> to indicate the position of
     *        the configuration set in the configuration set list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationSetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     * 
     * @param maxItems
     *        The number of configuration sets to return.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     * 
     * @return The number of configuration sets to return.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     * 
     * @param maxItems
     *        The number of configuration sets to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationSetsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationSetsRequest == false)
            return false;
        ListConfigurationSetsRequest other = (ListConfigurationSetsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationSetsRequest clone() {
        return (ListConfigurationSetsRequest) super.clone();
    }

}
