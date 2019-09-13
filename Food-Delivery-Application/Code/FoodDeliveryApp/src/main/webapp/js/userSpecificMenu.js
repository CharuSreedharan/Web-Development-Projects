 document.addEventListener('DOMContentLoaded', function() {
            let username = localStorage.getItem('username');
            if(username==null)
            {
            document.getElementById("userspecific").style.display='None';
        }
        else
        {
            alert(document.getElementById("userspecific").innerHTML="Welcome "+username)
        }
        }, false);