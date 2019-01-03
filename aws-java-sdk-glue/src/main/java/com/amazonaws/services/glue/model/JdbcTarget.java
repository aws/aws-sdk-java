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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a JDBC data store to crawl.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/JdbcTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JdbcTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the connection to use to connect to the JDBC target.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The path of the JDBC target.
     * </p>
     */
    private String path;
    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     */
    private java.util.List<String> exclusions;

    /**
     * <p>
     * The name of the connection to use to connect to the JDBC target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the JDBC target.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the JDBC target.
     * </p>
     * 
     * @return The name of the connection to use to connect to the JDBC target.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the JDBC target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the JDBC target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JdbcTarget withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The path of the JDBC target.
     * </p>
     * 
     * @param path
     *        The path of the JDBC target.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the JDBC target.
     * </p>
     * 
     * @return The path of the JDBC target.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of the JDBC target.
     * </p>
     * 
     * @param path
     *        The path of the JDBC target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JdbcTarget withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @return A list of glob patterns used to exclude from the crawl. For more information, see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     */

    public java.util.List<String> getExclusions() {
        return exclusions;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     */

    public void setExclusions(java.util.Collection<String> exclusions) {
        if (exclusions == null) {
            this.exclusions = null;
            return;
        }

        this.exclusions = new java.util.ArrayList<String>(exclusions);
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusions(java.util.Collection)} or {@link #withExclusions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JdbcTarget withExclusions(String... exclusions) {
        if (this.exclusions == null) {
            setExclusions(new java.util.ArrayList<String>(exclusions.length));
        }
        for (String ele : exclusions) {
            this.exclusions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JdbcTarget withExclusions(java.util.Collection<String> exclusions) {
        setExclusions(exclusions);
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
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getExclusions() != null)
            sb.append("Exclusions: ").append(getExclusions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JdbcTarget == false)
            return false;
        JdbcTarget other = (JdbcTarget) obj;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getExclusions() == null ^ this.getExclusions() == null)
            return false;
        if (other.getExclusions() != null && other.getExclusions().equals(this.getExclusions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        return hashCode;
    }

    @Override
    public JdbcTarget clone() {
        try {
            return (JdbcTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JdbcTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
