/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON Web Key key type in <a href=
 * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#rfc.section.4"
 * >JSON Web Key (JWK) Format</a>.
 * </p>
 */
public class KeyType implements Serializable, Cloneable {

    /**
     * <p>
     * A "kty" key type parameter. For more information, see <a href="">JSON Web
     * Key (JWK) Format</a>.
     * </p>
     */
    private String kty;
    /**
     * <p>
     * A "kty" (Key Type) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#ktyDef"
     * >"kty" (Key Type) Parameter</a>.
     * </p>
     */
    private String alg;
    /**
     * <p>
     * A "use" (Public Key Use) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#useDef"
     * >"use" (Public Key Use) Parameter</a>.
     * </p>
     */
    private String use;
    /**
     * <p>
     * A "kid" (Key ID) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#kidDef"
     * >"kid" (Key ID) Parameter</a>.
     * </p>
     */
    private String kid;
    /**
     * <p>
     * An "n" parameter.
     * </p>
     */
    private String n;
    /**
     * <p>
     * An "e" parameter.
     * </p>
     */
    private String e;

    /**
     * <p>
     * A "kty" key type parameter. For more information, see <a href="">JSON Web
     * Key (JWK) Format</a>.
     * </p>
     * 
     * @param kty
     *        A "kty" key type parameter. For more information, see <a
     *        href="">JSON Web Key (JWK) Format</a>.
     */

    public void setKty(String kty) {
        this.kty = kty;
    }

    /**
     * <p>
     * A "kty" key type parameter. For more information, see <a href="">JSON Web
     * Key (JWK) Format</a>.
     * </p>
     * 
     * @return A "kty" key type parameter. For more information, see <a
     *         href="">JSON Web Key (JWK) Format</a>.
     */

    public String getKty() {
        return this.kty;
    }

    /**
     * <p>
     * A "kty" key type parameter. For more information, see <a href="">JSON Web
     * Key (JWK) Format</a>.
     * </p>
     * 
     * @param kty
     *        A "kty" key type parameter. For more information, see <a
     *        href="">JSON Web Key (JWK) Format</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyType withKty(String kty) {
        setKty(kty);
        return this;
    }

    /**
     * <p>
     * A "kty" (Key Type) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#ktyDef"
     * >"kty" (Key Type) Parameter</a>.
     * </p>
     * 
     * @param alg
     *        A "kty" (Key Type) parameter. For more information, see <a href=
     *        "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#ktyDef"
     *        >"kty" (Key Type) Parameter</a>.
     */

    public void setAlg(String alg) {
        this.alg = alg;
    }

    /**
     * <p>
     * A "kty" (Key Type) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#ktyDef"
     * >"kty" (Key Type) Parameter</a>.
     * </p>
     * 
     * @return A "kty" (Key Type) parameter. For more information, see <a href=
     *         "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#ktyDef"
     *         >"kty" (Key Type) Parameter</a>.
     */

    public String getAlg() {
        return this.alg;
    }

    /**
     * <p>
     * A "kty" (Key Type) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#ktyDef"
     * >"kty" (Key Type) Parameter</a>.
     * </p>
     * 
     * @param alg
     *        A "kty" (Key Type) parameter. For more information, see <a href=
     *        "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#ktyDef"
     *        >"kty" (Key Type) Parameter</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyType withAlg(String alg) {
        setAlg(alg);
        return this;
    }

    /**
     * <p>
     * A "use" (Public Key Use) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#useDef"
     * >"use" (Public Key Use) Parameter</a>.
     * </p>
     * 
     * @param use
     *        A "use" (Public Key Use) parameter. For more information, see <a
     *        href=
     *        "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#useDef"
     *        >"use" (Public Key Use) Parameter</a>.
     */

    public void setUse(String use) {
        this.use = use;
    }

    /**
     * <p>
     * A "use" (Public Key Use) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#useDef"
     * >"use" (Public Key Use) Parameter</a>.
     * </p>
     * 
     * @return A "use" (Public Key Use) parameter. For more information, see <a
     *         href=
     *         "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#useDef"
     *         >"use" (Public Key Use) Parameter</a>.
     */

    public String getUse() {
        return this.use;
    }

    /**
     * <p>
     * A "use" (Public Key Use) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#useDef"
     * >"use" (Public Key Use) Parameter</a>.
     * </p>
     * 
     * @param use
     *        A "use" (Public Key Use) parameter. For more information, see <a
     *        href=
     *        "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#useDef"
     *        >"use" (Public Key Use) Parameter</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyType withUse(String use) {
        setUse(use);
        return this;
    }

    /**
     * <p>
     * A "kid" (Key ID) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#kidDef"
     * >"kid" (Key ID) Parameter</a>.
     * </p>
     * 
     * @param kid
     *        A "kid" (Key ID) parameter. For more information, see <a href=
     *        "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#kidDef"
     *        >"kid" (Key ID) Parameter</a>.
     */

    public void setKid(String kid) {
        this.kid = kid;
    }

    /**
     * <p>
     * A "kid" (Key ID) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#kidDef"
     * >"kid" (Key ID) Parameter</a>.
     * </p>
     * 
     * @return A "kid" (Key ID) parameter. For more information, see <a href=
     *         "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#kidDef"
     *         >"kid" (Key ID) Parameter</a>.
     */

    public String getKid() {
        return this.kid;
    }

    /**
     * <p>
     * A "kid" (Key ID) parameter. For more information, see <a href=
     * "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#kidDef"
     * >"kid" (Key ID) Parameter</a>.
     * </p>
     * 
     * @param kid
     *        A "kid" (Key ID) parameter. For more information, see <a href=
     *        "http://self-issued.info/docs/draft-ietf-jose-json-web-key.html#kidDef"
     *        >"kid" (Key ID) Parameter</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyType withKid(String kid) {
        setKid(kid);
        return this;
    }

    /**
     * <p>
     * An "n" parameter.
     * </p>
     * 
     * @param n
     *        An "n" parameter.
     */

    public void setN(String n) {
        this.n = n;
    }

    /**
     * <p>
     * An "n" parameter.
     * </p>
     * 
     * @return An "n" parameter.
     */

    public String getN() {
        return this.n;
    }

    /**
     * <p>
     * An "n" parameter.
     * </p>
     * 
     * @param n
     *        An "n" parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyType withN(String n) {
        setN(n);
        return this;
    }

    /**
     * <p>
     * An "e" parameter.
     * </p>
     * 
     * @param e
     *        An "e" parameter.
     */

    public void setE(String e) {
        this.e = e;
    }

    /**
     * <p>
     * An "e" parameter.
     * </p>
     * 
     * @return An "e" parameter.
     */

    public String getE() {
        return this.e;
    }

    /**
     * <p>
     * An "e" parameter.
     * </p>
     * 
     * @param e
     *        An "e" parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyType withE(String e) {
        setE(e);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKty() != null)
            sb.append("Kty: " + getKty() + ",");
        if (getAlg() != null)
            sb.append("Alg: " + getAlg() + ",");
        if (getUse() != null)
            sb.append("Use: " + getUse() + ",");
        if (getKid() != null)
            sb.append("Kid: " + getKid() + ",");
        if (getN() != null)
            sb.append("N: " + getN() + ",");
        if (getE() != null)
            sb.append("E: " + getE());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyType == false)
            return false;
        KeyType other = (KeyType) obj;
        if (other.getKty() == null ^ this.getKty() == null)
            return false;
        if (other.getKty() != null
                && other.getKty().equals(this.getKty()) == false)
            return false;
        if (other.getAlg() == null ^ this.getAlg() == null)
            return false;
        if (other.getAlg() != null
                && other.getAlg().equals(this.getAlg()) == false)
            return false;
        if (other.getUse() == null ^ this.getUse() == null)
            return false;
        if (other.getUse() != null
                && other.getUse().equals(this.getUse()) == false)
            return false;
        if (other.getKid() == null ^ this.getKid() == null)
            return false;
        if (other.getKid() != null
                && other.getKid().equals(this.getKid()) == false)
            return false;
        if (other.getN() == null ^ this.getN() == null)
            return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false)
            return false;
        if (other.getE() == null ^ this.getE() == null)
            return false;
        if (other.getE() != null && other.getE().equals(this.getE()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKty() == null) ? 0 : getKty().hashCode());
        hashCode = prime * hashCode
                + ((getAlg() == null) ? 0 : getAlg().hashCode());
        hashCode = prime * hashCode
                + ((getUse() == null) ? 0 : getUse().hashCode());
        hashCode = prime * hashCode
                + ((getKid() == null) ? 0 : getKid().hashCode());
        hashCode = prime * hashCode
                + ((getN() == null) ? 0 : getN().hashCode());
        hashCode = prime * hashCode
                + ((getE() == null) ? 0 : getE().hashCode());
        return hashCode;
    }

    @Override
    public KeyType clone() {
        try {
            return (KeyType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
