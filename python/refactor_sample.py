t = m.chk_temp()
if t > 160:
    tb = T()
    tb.cls_trp_v(2)
    ics.fill()
    ics.vent()
    m.airsyschk()
