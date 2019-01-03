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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the finding.
     * </p>
     */
    private java.util.List<Finding> findings;
    /**
     * <p>
     * Finding details that cannot be described. An error code is provided for each failed item.
     * </p>
     */
    private java.util.Map<String, FailedItemDetails> failedItems;

    /**
     * <p>
     * Information about the finding.
     * </p>
     * 
     * @return Information about the finding.
     */

    public java.util.List<Finding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * Information about the finding.
     * </p>
     * 
     * @param findings
     *        Information about the finding.
     */

    public void setFindings(java.util.Collection<Finding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<Finding>(findings);
    }

    /**
     * <p>
     * Information about the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindings(java.util.Collection)} or {@link #withFindings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param findings
     *        Information about the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFindingsResult withFindings(Finding... findings) {
        if (this.findings == null) {
            setFindings(new java.util.ArrayList<Finding>(findings.length));
        }
        for (Finding ele : findings) {
            this.findings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the finding.
     * </p>
     * 
     * @param findings
     *        Information about the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFindingsResult withFindings(java.util.Collection<Finding> findings) {
        setFindings(findings);
        return this;
    }

    /**
     * <p>
     * Finding details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @return Finding details that cannot be described. An error code is provided for each failed item.
     */

    public java.util.Map<String, FailedItemDetails> getFailedItems() {
        return failedItems;
    }

    /**
     * <p>
     * Finding details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Finding details that cannot be described. An error code is provided for each failed item.
     */

    public void setFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        this.failedItems = failedItems;
    }

    /**
     * <p>
     * Finding details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Finding details that cannot be described. An error code is provided for each failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFindingsResult withFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        setFailedItems(failedItems);
        return this;
    }

    public DescribeFindingsResult addFailedItemsEntry(String key, FailedItemDetails value) {
        if (null == this.failedItems) {
            this.failedItems = new java.util.HashMap<String, FailedItemDetails>();
        }
        if (this.failedItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedItems.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFindingsResult clearFailedItemsEntries() {
        this.failedItems = null;
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
        if (getFindings() != null)
            sb.append("Findings: ").append(getFindings()).append(",");
        if (getFailedItems() != null)
            sb.append("FailedItems: ").append(getFailedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFindingsResult == false)
            return false;
        DescribeFindingsResult other = (DescribeFindingsResult) obj;
        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
            return false;
        if (other.getFailedItems() == null ^ this.getFailedItems() == null)
            return false;
        if (other.getFailedItems() != null && other.getFailedItems().equals(this.getFailedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        hashCode = prime * hashCode + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFindingsResult clone() {
        try {
            return (DescribeFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
