/*
 * The eidas-opensaml project is an open-source package that extends OpenSAML
 * with definitions for the eIDAS Framework.
 *
 * More details on <https://github.com/litsec/eidas-opensaml>
 * Copyright (C) 2016 Litsec AB
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package se.litsec.eidas.opensaml.ext.attributes;

import org.opensaml.saml.common.SAMLObject;

/**
 * The eIDAS {@code CurrentFamilyNameType}.
 * 
 * <pre>
 * <xsd:complexType name="CurrentFamilyNameType">
 *   <xsd:annotation>
 *     <xsd:documentation>
 *       Current family name of the natural person.
 *     </xsd:documentation>
 *   </xsd:annotation>
 *   <xsd:simpleContent>
 *     <xsd:extension base="xsd:string">
 *       <xsd:attribute ref="LatinScript"/>
 *     </xsd:extension>
 *   </xsd:simpleContent>
 * </xsd:complexType>
 * </pre>
 * 
 * Example:
 * <pre>
 * <saml:Attribute
 *       FriendlyName="FamilyName"
 *       Name="http://eidas.europa.eu/attributes/naturalperson/CurrentFamilyName"
 *       NameFormat="urn:oasis:names:tc:SAML:2.0:attrname-format:uri">
 *   <saml:AttributeValue xsi:type="eidas:CurrentFamilyNameType">
 *     Chalk
 *   </saml:AttributeValue>
 * </saml:Attribute>
 * </pre>
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public interface CurrentFamilyNameType extends TransliterationStringType, SAMLObject {
}
