/* Copyright (C) 2001  Free Software Foundation

   This file is part of libgcj.

This software is copyrighted work licensed under the terms of the
Libgcj License.  Please consult the file "LIBGCJ_LICENSE" for
details.  */
 
package javax.naming.ldap;
import javax.naming.*;
 
/**
 * @author Warren Levy <warrenl@redhat.com>
 * @date June 1, 2001
 */

public interface UnsolicitedNotification extends ExtendedResponse, HasControls
{
  public String[] getReferrals();
  public NamingException getException();
}