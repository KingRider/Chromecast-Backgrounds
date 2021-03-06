package com.nerdwaller;

import org.apache.commons.io.FilenameUtils;

public class Background {
	protected String href;
	protected String author;
	
	public Background(String href, String author) {
		this.href = href;
		this.author = author;
	}
	
	public String getHref() {
		return href;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getName() {
		return FilenameUtils.getBaseName(href).replace("%2B", "").replace("%2", "") + "." + FilenameUtils.getExtension(href).toLowerCase();
	}

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Background)) {
            return false;
        }
        Background otherBg = (Background) obj;

        return (href.equals(otherBg.getHref()) && author.equals(otherBg.getAuthor()));
    }
}
