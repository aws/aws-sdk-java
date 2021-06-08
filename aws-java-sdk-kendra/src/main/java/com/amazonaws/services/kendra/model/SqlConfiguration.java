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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that configures Amazon Kendra to use a SQL database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SqlConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (") when
     * making a database query.
     * </p>
     * <p>
     * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     * configuration. It does not change the case of identifiers or enclose them in quotes.
     * </p>
     * <p>
     * PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they are
     * quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the character's
     * case.
     * </p>
     * <p>
     * For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     * <code>DOUBLE_QUOTES</code>.
     * </p>
     */
    private String queryIdentifiersEnclosingOption;

    /**
     * <p>
     * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (") when
     * making a database query.
     * </p>
     * <p>
     * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     * configuration. It does not change the case of identifiers or enclose them in quotes.
     * </p>
     * <p>
     * PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they are
     * quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the character's
     * case.
     * </p>
     * <p>
     * For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     * <code>DOUBLE_QUOTES</code>.
     * </p>
     * 
     * @param queryIdentifiersEnclosingOption
     *        Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (")
     *        when making a database query.</p>
     *        <p>
     *        By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     *        configuration. It does not change the case of identifiers or enclose them in quotes.
     *        </p>
     *        <p>
     *        PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they
     *        are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the
     *        character's case.
     *        </p>
     *        <p>
     *        For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     *        <code>DOUBLE_QUOTES</code>.
     * @see QueryIdentifiersEnclosingOption
     */

    public void setQueryIdentifiersEnclosingOption(String queryIdentifiersEnclosingOption) {
        this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption;
    }

    /**
     * <p>
     * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (") when
     * making a database query.
     * </p>
     * <p>
     * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     * configuration. It does not change the case of identifiers or enclose them in quotes.
     * </p>
     * <p>
     * PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they are
     * quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the character's
     * case.
     * </p>
     * <p>
     * For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     * <code>DOUBLE_QUOTES</code>.
     * </p>
     * 
     * @return Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes
     *         (") when making a database query.</p>
     *         <p>
     *         By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     *         configuration. It does not change the case of identifiers or enclose them in quotes.
     *         </p>
     *         <p>
     *         PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they
     *         are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the
     *         character's case.
     *         </p>
     *         <p>
     *         For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     *         <code>DOUBLE_QUOTES</code>.
     * @see QueryIdentifiersEnclosingOption
     */

    public String getQueryIdentifiersEnclosingOption() {
        return this.queryIdentifiersEnclosingOption;
    }

    /**
     * <p>
     * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (") when
     * making a database query.
     * </p>
     * <p>
     * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     * configuration. It does not change the case of identifiers or enclose them in quotes.
     * </p>
     * <p>
     * PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they are
     * quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the character's
     * case.
     * </p>
     * <p>
     * For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     * <code>DOUBLE_QUOTES</code>.
     * </p>
     * 
     * @param queryIdentifiersEnclosingOption
     *        Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (")
     *        when making a database query.</p>
     *        <p>
     *        By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     *        configuration. It does not change the case of identifiers or enclose them in quotes.
     *        </p>
     *        <p>
     *        PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they
     *        are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the
     *        character's case.
     *        </p>
     *        <p>
     *        For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     *        <code>DOUBLE_QUOTES</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryIdentifiersEnclosingOption
     */

    public SqlConfiguration withQueryIdentifiersEnclosingOption(String queryIdentifiersEnclosingOption) {
        setQueryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption);
        return this;
    }

    /**
     * <p>
     * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (") when
     * making a database query.
     * </p>
     * <p>
     * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     * configuration. It does not change the case of identifiers or enclose them in quotes.
     * </p>
     * <p>
     * PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they are
     * quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the character's
     * case.
     * </p>
     * <p>
     * For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     * <code>DOUBLE_QUOTES</code>.
     * </p>
     * 
     * @param queryIdentifiersEnclosingOption
     *        Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (")
     *        when making a database query.</p>
     *        <p>
     *        By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source
     *        configuration. It does not change the case of identifiers or enclose them in quotes.
     *        </p>
     *        <p>
     *        PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they
     *        are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the
     *        character's case.
     *        </p>
     *        <p>
     *        For MySQL databases, you must enable the <code>ansi_quotes</code> option when you set this field to
     *        <code>DOUBLE_QUOTES</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryIdentifiersEnclosingOption
     */

    public SqlConfiguration withQueryIdentifiersEnclosingOption(QueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption) {
        this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption.toString();
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
        if (getQueryIdentifiersEnclosingOption() != null)
            sb.append("QueryIdentifiersEnclosingOption: ").append(getQueryIdentifiersEnclosingOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlConfiguration == false)
            return false;
        SqlConfiguration other = (SqlConfiguration) obj;
        if (other.getQueryIdentifiersEnclosingOption() == null ^ this.getQueryIdentifiersEnclosingOption() == null)
            return false;
        if (other.getQueryIdentifiersEnclosingOption() != null
                && other.getQueryIdentifiersEnclosingOption().equals(this.getQueryIdentifiersEnclosingOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryIdentifiersEnclosingOption() == null) ? 0 : getQueryIdentifiersEnclosingOption().hashCode());
        return hashCode;
    }

    @Override
    public SqlConfiguration clone() {
        try {
            return (SqlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SqlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
