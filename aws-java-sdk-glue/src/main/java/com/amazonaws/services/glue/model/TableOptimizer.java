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
 * Contains details about an optimizer associated with a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TableOptimizer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableOptimizer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A <code>TableOptimizerConfiguration</code> object that was specified when creating or updating a table optimizer.
     * </p>
     */
    private TableOptimizerConfiguration configuration;
    /**
     * <p>
     * A <code>TableOptimizerRun</code> object representing the last run of the table optimizer.
     * </p>
     */
    private TableOptimizerRun lastRun;

    /**
     * <p>
     * The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * </p>
     * 
     * @param type
     *        The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * @see TableOptimizerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * </p>
     * 
     * @return The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * @see TableOptimizerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * </p>
     * 
     * @param type
     *        The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOptimizerType
     */

    public TableOptimizer withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * </p>
     * 
     * @param type
     *        The type of table optimizer. Currently, the only valid value is <code>compaction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOptimizerType
     */

    public TableOptimizer withType(TableOptimizerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>TableOptimizerConfiguration</code> object that was specified when creating or updating a table optimizer.
     * </p>
     * 
     * @param configuration
     *        A <code>TableOptimizerConfiguration</code> object that was specified when creating or updating a table
     *        optimizer.
     */

    public void setConfiguration(TableOptimizerConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * A <code>TableOptimizerConfiguration</code> object that was specified when creating or updating a table optimizer.
     * </p>
     * 
     * @return A <code>TableOptimizerConfiguration</code> object that was specified when creating or updating a table
     *         optimizer.
     */

    public TableOptimizerConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * A <code>TableOptimizerConfiguration</code> object that was specified when creating or updating a table optimizer.
     * </p>
     * 
     * @param configuration
     *        A <code>TableOptimizerConfiguration</code> object that was specified when creating or updating a table
     *        optimizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizer withConfiguration(TableOptimizerConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A <code>TableOptimizerRun</code> object representing the last run of the table optimizer.
     * </p>
     * 
     * @param lastRun
     *        A <code>TableOptimizerRun</code> object representing the last run of the table optimizer.
     */

    public void setLastRun(TableOptimizerRun lastRun) {
        this.lastRun = lastRun;
    }

    /**
     * <p>
     * A <code>TableOptimizerRun</code> object representing the last run of the table optimizer.
     * </p>
     * 
     * @return A <code>TableOptimizerRun</code> object representing the last run of the table optimizer.
     */

    public TableOptimizerRun getLastRun() {
        return this.lastRun;
    }

    /**
     * <p>
     * A <code>TableOptimizerRun</code> object representing the last run of the table optimizer.
     * </p>
     * 
     * @param lastRun
     *        A <code>TableOptimizerRun</code> object representing the last run of the table optimizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizer withLastRun(TableOptimizerRun lastRun) {
        setLastRun(lastRun);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getLastRun() != null)
            sb.append("LastRun: ").append(getLastRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableOptimizer == false)
            return false;
        TableOptimizer other = (TableOptimizer) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getLastRun() == null ^ this.getLastRun() == null)
            return false;
        if (other.getLastRun() != null && other.getLastRun().equals(this.getLastRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLastRun() == null) ? 0 : getLastRun().hashCode());
        return hashCode;
    }

    @Override
    public TableOptimizer clone() {
        try {
            return (TableOptimizer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableOptimizerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
