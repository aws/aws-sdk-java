/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies an Apache Iceberg data source where Iceberg tables are stored in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/IcebergTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IcebergTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     * </p>
     */
    private java.util.List<String> paths;
    /**
     * <p>
     * The name of the connection to use to connect to the Iceberg target.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     */
    private java.util.List<String> exclusions;
    /**
     * <p>
     * The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg metadata folder in
     * your Amazon S3 path. Used to limit the crawler run time.
     * </p>
     */
    private Integer maximumTraversalDepth;

    /**
     * <p>
     * One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     * </p>
     * 
     * @return One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     */

    public java.util.List<String> getPaths() {
        return paths;
    }

    /**
     * <p>
     * One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     * </p>
     * 
     * @param paths
     *        One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     */

    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        this.paths = new java.util.ArrayList<String>(paths);
    }

    /**
     * <p>
     * One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPaths(java.util.Collection)} or {@link #withPaths(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param paths
     *        One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergTarget withPaths(String... paths) {
        if (this.paths == null) {
            setPaths(new java.util.ArrayList<String>(paths.length));
        }
        for (String ele : paths) {
            this.paths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     * </p>
     * 
     * @param paths
     *        One or more Amazon S3 paths that contains Iceberg metadata folders as <code>s3://bucket/prefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergTarget withPaths(java.util.Collection<String> paths) {
        setPaths(paths);
        return this;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Iceberg target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the Iceberg target.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Iceberg target.
     * </p>
     * 
     * @return The name of the connection to use to connect to the Iceberg target.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Iceberg target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the Iceberg target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergTarget withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @return A list of glob patterns used to exclude from the crawl. For more information, see <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     */

    public java.util.List<String> getExclusions() {
        return exclusions;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
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
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusions(java.util.Collection)} or {@link #withExclusions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergTarget withExclusions(String... exclusions) {
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
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergTarget withExclusions(java.util.Collection<String> exclusions) {
        setExclusions(exclusions);
        return this;
    }

    /**
     * <p>
     * The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg metadata folder in
     * your Amazon S3 path. Used to limit the crawler run time.
     * </p>
     * 
     * @param maximumTraversalDepth
     *        The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg metadata folder
     *        in your Amazon S3 path. Used to limit the crawler run time.
     */

    public void setMaximumTraversalDepth(Integer maximumTraversalDepth) {
        this.maximumTraversalDepth = maximumTraversalDepth;
    }

    /**
     * <p>
     * The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg metadata folder in
     * your Amazon S3 path. Used to limit the crawler run time.
     * </p>
     * 
     * @return The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg metadata
     *         folder in your Amazon S3 path. Used to limit the crawler run time.
     */

    public Integer getMaximumTraversalDepth() {
        return this.maximumTraversalDepth;
    }

    /**
     * <p>
     * The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg metadata folder in
     * your Amazon S3 path. Used to limit the crawler run time.
     * </p>
     * 
     * @param maximumTraversalDepth
     *        The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg metadata folder
     *        in your Amazon S3 path. Used to limit the crawler run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergTarget withMaximumTraversalDepth(Integer maximumTraversalDepth) {
        setMaximumTraversalDepth(maximumTraversalDepth);
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
        if (getPaths() != null)
            sb.append("Paths: ").append(getPaths()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getExclusions() != null)
            sb.append("Exclusions: ").append(getExclusions()).append(",");
        if (getMaximumTraversalDepth() != null)
            sb.append("MaximumTraversalDepth: ").append(getMaximumTraversalDepth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IcebergTarget == false)
            return false;
        IcebergTarget other = (IcebergTarget) obj;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getExclusions() == null ^ this.getExclusions() == null)
            return false;
        if (other.getExclusions() != null && other.getExclusions().equals(this.getExclusions()) == false)
            return false;
        if (other.getMaximumTraversalDepth() == null ^ this.getMaximumTraversalDepth() == null)
            return false;
        if (other.getMaximumTraversalDepth() != null && other.getMaximumTraversalDepth().equals(this.getMaximumTraversalDepth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        hashCode = prime * hashCode + ((getMaximumTraversalDepth() == null) ? 0 : getMaximumTraversalDepth().hashCode());
        return hashCode;
    }

    @Override
    public IcebergTarget clone() {
        try {
            return (IcebergTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.IcebergTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
