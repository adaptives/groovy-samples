/**
 * (BSD Style License)
 *
 * Copyright (c) 2001-2008, Adaptive Software Solutions
 * 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice, this 
 * list of conditions and the following disclaimer. Redistributions in binary 
 * form must reproduce the above copyright notice, this list of conditions and 
 * the following disclaimer in the documentation and/or other materials provided 
 * with the distribution.
 * 
 * Neither the name of Adaptive Software Solutions nor the names of its 
 * contributors may be used to endorse or promote products derived from this 
 * software without specific prior written permission.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE 
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL 
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR 
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, 
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE 
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import javax.xml.parsers.*;

def builder = new groovy.xml.MarkupBuilder()

builder.statuses(type:"array") {
	status {
		created_at('Thu Apr 02 06:04:23 +0000 2009')
		id(1234567890)
		text("Groovy does not yet support inner classes. Need to use closures instead. Don't if that is a good thing.")
		source('web')
		truncated('false')
		in_reply_to_status_id()
		in_reply_to_user_id()
		favorited('false')
		in_reply_to_screen_name()
		user {
			id('12345678')
			name('TWitter User')
			screen_name('twitter_user')
			location('The Arctic')
			description('Farmer')
			profile_image_url('http://static.twitter.com/images/default_profile_normal.png')
			url('http://someweb.com')
			'protected'('false')
			followers_count('23')
			profile_background_color('352726')
			profile_text_color('3E4415')
			profile_link_color('D02B55')
			profile_sidebar_fill_color('99CC33')
			profile_sidebar_border_color('829D5E')
			friends_count('19')
			created_at('Wed Oct 22 06:59:46 +0000 2008')
			favourites_count('0')
			utc_offset('-36000')
			time_zone('Hawaii')
			profile_background_image_url('http://static.twitter.com/images/themes/theme5/bg.gif')
			profile_background_tile('false')
			statuses_count('77')
			notifications('false')
			following('true')
		}		
	}
}
def out = new StringWriter()
builder.print(out)
println out.toString()


