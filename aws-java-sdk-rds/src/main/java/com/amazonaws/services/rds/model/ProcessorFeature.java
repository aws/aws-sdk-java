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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the processor features of a DB instance class.
 * </p>
 * <p>
 * To specify the number of CPU cores, use the <code>coreCount</code> feature name for the <code>Name</code> parameter.
 * To specify the number of threads per core, use the <code>threadsPerCore</code> feature name for the <code>Name</code>
 * parameter.
 * </p>
 * <p>
 * You can set the processor features of the DB instance class for a DB instance when you call one of the following
 * actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateDBInstance</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ModifyDBInstance</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RestoreDBInstanceFromDBSnapshot</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RestoreDBInstanceFromS3</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RestoreDBInstanceToPointInTime</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can view the valid processor values for a particular instance class by calling the
 * <a>DescribeOrderableDBInstanceOptions</a> action and specifying the instance class for the
 * <code>DBInstanceClass</code> parameter.
 * </p>
 * <p>
 * In addition, you can use the following actions for DB instance class processor information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeDBInstances</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeDBSnapshots</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeValidDBInstanceModifications</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor"
 * >Configuring the Processor of the DB Instance Class</a> in the <i>Amazon RDS User Guide. </i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ProcessorFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessorFeature implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code> and <code>threadsPerCore</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code> and <code>threadsPerCore</code>.
     * </p>
     * 
     * @param name
     *        The name of the processor feature. Valid names are <code>coreCount</code> and <code>threadsPerCore</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code> and <code>threadsPerCore</code>.
     * </p>
     * 
     * @return The name of the processor feature. Valid names are <code>coreCount</code> and <code>threadsPerCore</code>
     *         .
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code> and <code>threadsPerCore</code>.
     * </p>
     * 
     * @param name
     *        The name of the processor feature. Valid names are <code>coreCount</code> and <code>threadsPerCore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessorFeature withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     * 
     * @param value
     *        The value of a processor feature name.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     * 
     * @return The value of a processor feature name.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     * 
     * @param value
     *        The value of a processor feature name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessorFeature withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessorFeature == false)
            return false;
        ProcessorFeature other = (ProcessorFeature) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ProcessorFeature clone() {
        try {
            return (ProcessorFeature) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
