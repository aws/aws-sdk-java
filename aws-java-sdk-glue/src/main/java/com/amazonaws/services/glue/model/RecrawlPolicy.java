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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When crawling an Amazon S3 data source after the first crawl is complete, specifies whether to crawl the entire
 * dataset again or to crawl only folders that were added since the last crawler run. For more information, see <a
 * href="https://docs.aws.amazon.com/glue/latest/dg/incremental-crawls.html">Incremental Crawls in Glue</a> in the
 * developer guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RecrawlPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecrawlPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last
     * crawler run.
     * </p>
     * <p>
     * A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     * </p>
     * <p>
     * A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the last
     * crawler run.
     * </p>
     */
    private String recrawlBehavior;

    /**
     * <p>
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last
     * crawler run.
     * </p>
     * <p>
     * A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     * </p>
     * <p>
     * A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the last
     * crawler run.
     * </p>
     * 
     * @param recrawlBehavior
     *        Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the
     *        last crawler run.</p>
     *        <p>
     *        A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     *        </p>
     *        <p>
     *        A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the
     *        last crawler run.
     * @see RecrawlBehavior
     */

    public void setRecrawlBehavior(String recrawlBehavior) {
        this.recrawlBehavior = recrawlBehavior;
    }

    /**
     * <p>
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last
     * crawler run.
     * </p>
     * <p>
     * A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     * </p>
     * <p>
     * A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the last
     * crawler run.
     * </p>
     * 
     * @return Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the
     *         last crawler run.</p>
     *         <p>
     *         A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     *         </p>
     *         <p>
     *         A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the
     *         last crawler run.
     * @see RecrawlBehavior
     */

    public String getRecrawlBehavior() {
        return this.recrawlBehavior;
    }

    /**
     * <p>
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last
     * crawler run.
     * </p>
     * <p>
     * A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     * </p>
     * <p>
     * A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the last
     * crawler run.
     * </p>
     * 
     * @param recrawlBehavior
     *        Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the
     *        last crawler run.</p>
     *        <p>
     *        A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     *        </p>
     *        <p>
     *        A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the
     *        last crawler run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecrawlBehavior
     */

    public RecrawlPolicy withRecrawlBehavior(String recrawlBehavior) {
        setRecrawlBehavior(recrawlBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last
     * crawler run.
     * </p>
     * <p>
     * A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     * </p>
     * <p>
     * A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the last
     * crawler run.
     * </p>
     * 
     * @param recrawlBehavior
     *        Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the
     *        last crawler run.</p>
     *        <p>
     *        A value of <code>CRAWL_EVERYTHING</code> specifies crawling the entire dataset again.
     *        </p>
     *        <p>
     *        A value of <code>CRAWL_NEW_FOLDERS_ONLY</code> specifies crawling only folders that were added since the
     *        last crawler run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecrawlBehavior
     */

    public RecrawlPolicy withRecrawlBehavior(RecrawlBehavior recrawlBehavior) {
        this.recrawlBehavior = recrawlBehavior.toString();
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
        if (getRecrawlBehavior() != null)
            sb.append("RecrawlBehavior: ").append(getRecrawlBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecrawlPolicy == false)
            return false;
        RecrawlPolicy other = (RecrawlPolicy) obj;
        if (other.getRecrawlBehavior() == null ^ this.getRecrawlBehavior() == null)
            return false;
        if (other.getRecrawlBehavior() != null && other.getRecrawlBehavior().equals(this.getRecrawlBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecrawlBehavior() == null) ? 0 : getRecrawlBehavior().hashCode());
        return hashCode;
    }

    @Override
    public RecrawlPolicy clone() {
        try {
            return (RecrawlPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RecrawlPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
