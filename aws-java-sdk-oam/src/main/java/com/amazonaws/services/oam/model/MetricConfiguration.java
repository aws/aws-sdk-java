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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains the <code>Filter</code> parameter which you can use to specify which metric namespaces are to
 * be shared from this source account to the monitoring account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/MetricConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this field to specify which metrics are to be shared with the monitoring account. Use the term
     * <code>Namespace</code> and one or more of the following operands. Use single quotation marks (') around namespace
     * names. The matching of namespace names is case sensitive. Each filter has a limit of five conditional operands.
     * Conditional operands are <code>AND</code> and <code>OR</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>=</code> and <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIKE</code> and <code>NOT LIKE</code>. These can be used only as prefix searches. Include a <code>%</code>
     * at the end of the string that you want to search for and include.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code> and <code>NOT IN</code>, using parentheses <code>( )</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Namespace NOT LIKE 'AWS/%'</code> includes only namespaces that don't start with <code>AWS/</code>, such as
     * custom namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')</code> includes only the metrics in the EC2, Elastic Load
     * Balancing, and Amazon S3 namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'</code> includes only the EC2 namespace and your custom
     * namespaces.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you are updating a link that uses filters, you can specify <code>*</code> as the only value for the
     * <code>filter</code> parameter to delete the filter and share all metric namespaces with the monitoring account.
     * </p>
     * </note>
     */
    private String filter;

    /**
     * <p>
     * Use this field to specify which metrics are to be shared with the monitoring account. Use the term
     * <code>Namespace</code> and one or more of the following operands. Use single quotation marks (') around namespace
     * names. The matching of namespace names is case sensitive. Each filter has a limit of five conditional operands.
     * Conditional operands are <code>AND</code> and <code>OR</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>=</code> and <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIKE</code> and <code>NOT LIKE</code>. These can be used only as prefix searches. Include a <code>%</code>
     * at the end of the string that you want to search for and include.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code> and <code>NOT IN</code>, using parentheses <code>( )</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Namespace NOT LIKE 'AWS/%'</code> includes only namespaces that don't start with <code>AWS/</code>, such as
     * custom namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')</code> includes only the metrics in the EC2, Elastic Load
     * Balancing, and Amazon S3 namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'</code> includes only the EC2 namespace and your custom
     * namespaces.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you are updating a link that uses filters, you can specify <code>*</code> as the only value for the
     * <code>filter</code> parameter to delete the filter and share all metric namespaces with the monitoring account.
     * </p>
     * </note>
     * 
     * @param filter
     *        Use this field to specify which metrics are to be shared with the monitoring account. Use the term
     *        <code>Namespace</code> and one or more of the following operands. Use single quotation marks (') around
     *        namespace names. The matching of namespace names is case sensitive. Each filter has a limit of five
     *        conditional operands. Conditional operands are <code>AND</code> and <code>OR</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>=</code> and <code>!=</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LIKE</code> and <code>NOT LIKE</code>. These can be used only as prefix searches. Include a
     *        <code>%</code> at the end of the string that you want to search for and include.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code> and <code>NOT IN</code>, using parentheses <code>( )</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Namespace NOT LIKE 'AWS/%'</code> includes only namespaces that don't start with <code>AWS/</code>,
     *        such as custom namespaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')</code> includes only the metrics in the EC2, Elastic
     *        Load Balancing, and Amazon S3 namespaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'</code> includes only the EC2 namespace and your
     *        custom namespaces.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you are updating a link that uses filters, you can specify <code>*</code> as the only value for the
     *        <code>filter</code> parameter to delete the filter and share all metric namespaces with the monitoring
     *        account.
     *        </p>
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Use this field to specify which metrics are to be shared with the monitoring account. Use the term
     * <code>Namespace</code> and one or more of the following operands. Use single quotation marks (') around namespace
     * names. The matching of namespace names is case sensitive. Each filter has a limit of five conditional operands.
     * Conditional operands are <code>AND</code> and <code>OR</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>=</code> and <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIKE</code> and <code>NOT LIKE</code>. These can be used only as prefix searches. Include a <code>%</code>
     * at the end of the string that you want to search for and include.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code> and <code>NOT IN</code>, using parentheses <code>( )</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Namespace NOT LIKE 'AWS/%'</code> includes only namespaces that don't start with <code>AWS/</code>, such as
     * custom namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')</code> includes only the metrics in the EC2, Elastic Load
     * Balancing, and Amazon S3 namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'</code> includes only the EC2 namespace and your custom
     * namespaces.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you are updating a link that uses filters, you can specify <code>*</code> as the only value for the
     * <code>filter</code> parameter to delete the filter and share all metric namespaces with the monitoring account.
     * </p>
     * </note>
     * 
     * @return Use this field to specify which metrics are to be shared with the monitoring account. Use the term
     *         <code>Namespace</code> and one or more of the following operands. Use single quotation marks (') around
     *         namespace names. The matching of namespace names is case sensitive. Each filter has a limit of five
     *         conditional operands. Conditional operands are <code>AND</code> and <code>OR</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>=</code> and <code>!=</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AND</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LIKE</code> and <code>NOT LIKE</code>. These can be used only as prefix searches. Include a
     *         <code>%</code> at the end of the string that you want to search for and include.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN</code> and <code>NOT IN</code>, using parentheses <code>( )</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Namespace NOT LIKE 'AWS/%'</code> includes only namespaces that don't start with <code>AWS/</code>,
     *         such as custom namespaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')</code> includes only the metrics in the EC2, Elastic
     *         Load Balancing, and Amazon S3 namespaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'</code> includes only the EC2 namespace and your
     *         custom namespaces.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If you are updating a link that uses filters, you can specify <code>*</code> as the only value for the
     *         <code>filter</code> parameter to delete the filter and share all metric namespaces with the monitoring
     *         account.
     *         </p>
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Use this field to specify which metrics are to be shared with the monitoring account. Use the term
     * <code>Namespace</code> and one or more of the following operands. Use single quotation marks (') around namespace
     * names. The matching of namespace names is case sensitive. Each filter has a limit of five conditional operands.
     * Conditional operands are <code>AND</code> and <code>OR</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>=</code> and <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIKE</code> and <code>NOT LIKE</code>. These can be used only as prefix searches. Include a <code>%</code>
     * at the end of the string that you want to search for and include.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code> and <code>NOT IN</code>, using parentheses <code>( )</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Namespace NOT LIKE 'AWS/%'</code> includes only namespaces that don't start with <code>AWS/</code>, such as
     * custom namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')</code> includes only the metrics in the EC2, Elastic Load
     * Balancing, and Amazon S3 namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'</code> includes only the EC2 namespace and your custom
     * namespaces.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you are updating a link that uses filters, you can specify <code>*</code> as the only value for the
     * <code>filter</code> parameter to delete the filter and share all metric namespaces with the monitoring account.
     * </p>
     * </note>
     * 
     * @param filter
     *        Use this field to specify which metrics are to be shared with the monitoring account. Use the term
     *        <code>Namespace</code> and one or more of the following operands. Use single quotation marks (') around
     *        namespace names. The matching of namespace names is case sensitive. Each filter has a limit of five
     *        conditional operands. Conditional operands are <code>AND</code> and <code>OR</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>=</code> and <code>!=</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LIKE</code> and <code>NOT LIKE</code>. These can be used only as prefix searches. Include a
     *        <code>%</code> at the end of the string that you want to search for and include.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code> and <code>NOT IN</code>, using parentheses <code>( )</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Namespace NOT LIKE 'AWS/%'</code> includes only namespaces that don't start with <code>AWS/</code>,
     *        such as custom namespaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')</code> includes only the metrics in the EC2, Elastic
     *        Load Balancing, and Amazon S3 namespaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'</code> includes only the EC2 namespace and your
     *        custom namespaces.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you are updating a link that uses filters, you can specify <code>*</code> as the only value for the
     *        <code>filter</code> parameter to delete the filter and share all metric namespaces with the monitoring
     *        account.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricConfiguration withFilter(String filter) {
        setFilter(filter);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricConfiguration == false)
            return false;
        MetricConfiguration other = (MetricConfiguration) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public MetricConfiguration clone() {
        try {
            return (MetricConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.oam.model.transform.MetricConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
